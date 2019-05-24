package uk.ac.kcl.inf.modelling.xdsml.gemoc_henshin.engine.solvers.heuristics

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.henshin.interpreter.Match
import org.eclipse.gemoc.trace.commons.model.trace.Step
import uk.ac.kcl.inf.modelling.xdsml.gemoc_henshin.engine.core.HenshinStep
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericParallelStep
import org.eclipse.gemoc.trace.commons.model.generictrace.GenerictraceFactory

class MaxNumberOfStepsHeuristic implements FilteringHeuristic {

	var int maxNumberOfSteps

	new(int maxNumberOfSteps) {
		super()
		this.maxNumberOfSteps = maxNumberOfSteps
	}

	new() {
		super()
		maxNumberOfSteps = 2
	}

	override List<Step<?>> filter(List<Step<?>> steps) {
		var validSteps = new ArrayList<Step<?>>()

		for (Step<?> s : steps) {
			if (s instanceof GenericParallelStep) {
				if (s.subSteps.length > maxNumberOfSteps) {
					var newSteps = new ArrayList<List<Match>>();
					generateSteps(
						s.subSteps.map[s2|val hs = s2 as HenshinStep hs.match].toList,
						newSteps,
						new ArrayList<Match>
					)
					validSteps.addAll(newSteps.map [ step |
						var ps = GenerictraceFactory.eINSTANCE.createGenericParallelStep
						ps.subSteps.addAll(step.map[m|new HenshinStep(m)])
						ps
					])
				} else {
					validSteps.add(s)
				}
			} else {
				validSteps.add(s)
			}
		}

		validSteps.removeDuplicates
	}

	/**
	 * Recursively produce all match sets of the given size from the list of matches and add to steps
	 */
	def void generateSteps(List<Match> matches, List<List<Match>> steps, List<Match> currentList) {
		if (currentList.size == maxNumberOfSteps) {
			steps.add(new ArrayList<Match>(currentList))
			return
		}

		matches.forEach [ m, idx |
			currentList.add(m)

			generateSteps(matches.subList(idx + 1, matches.size), steps, currentList)

			currentList.remove(currentList.size - 1)
		]
	}

	/**
	 * Remove all duplicate steps from the list.
	 * 
	 * FIXME: Not the most efficient implementation yet, and I suspect it will break if there 
	 * are multiple matches for the same rule that can be run in parallel
	 */
	def List<Step<?>> removeDuplicates(List<Step<?>> steps) {
		steps.fold(new ArrayList<Step<?>>, [ list, s |
			if (!list.exists [ s2 |
				if (s2 instanceof HenshinStep) {
					val hs = s as HenshinStep
					(hs.match === s2.match)
				} else {
					val ps2 = s2 as GenericParallelStep
					val ps = s as GenericParallelStep
					(ps.subSteps.map [ s3 |
						val hs3 = s3 as HenshinStep
						hs3.match
					].sortBy[m|m.rule.name] == ps2.subSteps.map [ s3 |
						val hs3 = s3 as HenshinStep
						hs3.match
					].sortBy[m|m.rule.name])
				}
			]) { list.add(s) }

			list
		]).toList
	}
}
