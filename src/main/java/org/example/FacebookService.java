package org.example;

import java.util.Objects;

public class FacebookService {

    public String[] fetchFacebookFriends(String profileLink) {
        if (Objects.equals(profileLink, "validProfileLink"))
            return new String[]{"Alice", "Bob", "Charlie"};
        throw new IllegalArgumentException("Invalid profile link");
    }
}
