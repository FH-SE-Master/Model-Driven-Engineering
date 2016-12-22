package com.clevercure.EVAL.observer;

import javax.inject.Event;

@Dependent
public class Observer {

	@Inject
	private Event<com.clevercure.event.LoginEvent> event0;
	@Inject
	private com.clevercure.evaluation.observer.LoginEventObserver delegateEvent0;

	public void observerEvent_0(@Observes com.clevercure.event.LoginEvent evt) {
		delegateEvent0.observe(evt);
	}
}
