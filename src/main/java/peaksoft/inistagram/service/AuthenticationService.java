package peaksoft.inistagram.service;

import peaksoft.inistagram.dto.authentication.AuthenticationResponse;
import peaksoft.inistagram.dto.authentication.ProfilResponse;
import peaksoft.inistagram.dto.authentication.SingUPRequest;

public interface AuthenticationService {
     AuthenticationResponse singUP(SingUPRequest sing);
    AuthenticationResponse singIn (SingUPRequest sing);
    ProfilResponse getPro();
}
