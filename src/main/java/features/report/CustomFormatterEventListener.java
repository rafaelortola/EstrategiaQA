package features.report;

import cucumber.api.event.EventHandler;
import cucumber.api.event.TestSourceRead;

import java.util.EventListener;

public class CustomFormatterEventListener implements EventListener {

    private CustomFormatter handler;

    public CustomFormatterEventListener(){
        super();
    }

    private EventHandler<TestSourceRead> testSourceReadEventHandler = new EventHandler<TestSourceRead>() {
        public void receive(TestSourceRead event) {
            //handler.handleTestSourceRead(event);
        }
    };

}
