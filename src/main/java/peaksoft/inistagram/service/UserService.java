package peaksoft.inistagram.service;

import peaksoft.inistagram.dto.SimpleResponse;
import peaksoft.inistagram.dto.user.UserRequest;

public interface UserService {
    SimpleResponse saveUser(UserRequest userRequest);
}
