package com.project_api.service;

import com.project_api.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
