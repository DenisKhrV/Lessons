package interfaces;

import exceptions.DiagnosticNotAllowedException;

public interface Diagnosticable {
    void runDiagnostic() throws DiagnosticNotAllowedException;
}
