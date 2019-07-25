package com.lex.githubapiassignment.models;

public class Comment {
    /**
     * url : https://api.github.com/repos/firebase/firebase-ios-sdk/issues/comments/503952410
     * html_url : https://github.com/firebase/firebase-ios-sdk/issues/3228#issuecomment-503952410
     * issue_url : https://api.github.com/repos/firebase/firebase-ios-sdk/issues/3228
     * id : 503952410
     * node_id : MDEyOklzc3VlQ29tbWVudDUwMzk1MjQxMA==
     * user : {"login":"google-oss-bot","id":26440463,"node_id":"MDQ6VXNlcjI2NDQwNDYz","avatar_url":"https://avatars0.githubusercontent.com/u/26440463?v=4","gravatar_id":"","url":"https://api.github.com/users/google-oss-bot","html_url":"https://github.com/google-oss-bot","followers_url":"https://api.github.com/users/google-oss-bot/followers","following_url":"https://api.github.com/users/google-oss-bot/following{/other_user}","gists_url":"https://api.github.com/users/google-oss-bot/gists{/gist_id}","starred_url":"https://api.github.com/users/google-oss-bot/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/google-oss-bot/subscriptions","organizations_url":"https://api.github.com/users/google-oss-bot/orgs","repos_url":"https://api.github.com/users/google-oss-bot/repos","events_url":"https://api.github.com/users/google-oss-bot/events{/privacy}","received_events_url":"https://api.github.com/users/google-oss-bot/received_events","type":"User","site_admin":false}
     * created_at : 2019-06-20T09:28:22Z
     * updated_at : 2019-06-20T23:12:55Z
     * author_association : COLLABORATOR
     * body : I found a few problems with this issue:
     * I couldn't figure out how to label this issue, so I've labeled it for a human to triage. Hang tight.
     * This issue does not seem to follow the issue template. Make sure you provide all the required information.
     */

    private String url;
    private String html_url;
    private String issue_url;
    private int id;
    private String node_id;
    private UserBean user;
    private String created_at;
    private String updated_at;
    private String author_association;
    private String body;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getIssue_url() {
        return issue_url;
    }

    public void setIssue_url(String issue_url) {
        this.issue_url = issue_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getAuthor_association() {
        return author_association;
    }

    public void setAuthor_association(String author_association) {
        this.author_association = author_association;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public static class UserBean {
        /**
         * login : google-oss-bot
         * id : 26440463
         * node_id : MDQ6VXNlcjI2NDQwNDYz
         * avatar_url : https://avatars0.githubusercontent.com/u/26440463?v=4
         * gravatar_id :
         * url : https://api.github.com/users/google-oss-bot
         * html_url : https://github.com/google-oss-bot
         * followers_url : https://api.github.com/users/google-oss-bot/followers
         * following_url : https://api.github.com/users/google-oss-bot/following{/other_user}
         * gists_url : https://api.github.com/users/google-oss-bot/gists{/gist_id}
         * starred_url : https://api.github.com/users/google-oss-bot/starred{/owner}{/repo}
         * subscriptions_url : https://api.github.com/users/google-oss-bot/subscriptions
         * organizations_url : https://api.github.com/users/google-oss-bot/orgs
         * repos_url : https://api.github.com/users/google-oss-bot/repos
         * events_url : https://api.github.com/users/google-oss-bot/events{/privacy}
         * received_events_url : https://api.github.com/users/google-oss-bot/received_events
         * type : User
         * site_admin : false
         */

        private String login;
        private int id;
        private String node_id;
        private String avatar_url;
        private String gravatar_id;
        private String url;
        private String html_url;
        private String followers_url;
        private String following_url;
        private String gists_url;
        private String starred_url;
        private String subscriptions_url;
        private String organizations_url;
        private String repos_url;
        private String events_url;
        private String received_events_url;
        private String type;
        private boolean site_admin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isSite_admin() {
            return site_admin;
        }

        public void setSite_admin(boolean site_admin) {
            this.site_admin = site_admin;
        }
    }
}
