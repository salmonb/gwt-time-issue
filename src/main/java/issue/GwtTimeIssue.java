package issue;

import com.google.gwt.core.client.EntryPoint;

import java.time.LocalDate;

/**
 * @author Bruno Salmon
 */
public final class GwtTimeIssue implements EntryPoint {

    @Override
    public void onModuleLoad() {
        logConsole(LocalDate.now());
    }

    private static native void logConsole(Object message) /*-{ $wnd.console.log(message); }-*/;

}
