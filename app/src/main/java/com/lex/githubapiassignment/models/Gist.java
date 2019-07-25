package com.lex.githubapiassignment.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Gist {


    /**
     * url : https://api.github.com/repos/firebase/firebase-ios-sdk/issues/3432
     * repository_url : https://api.github.com/repos/firebase/firebase-ios-sdk
     * labels_url : https://api.github.com/repos/firebase/firebase-ios-sdk/issues/3432/labels{/name}
     * comments_url : https://api.github.com/repos/firebase/firebase-ios-sdk/issues/3432/comments
     * events_url : https://api.github.com/repos/firebase/firebase-ios-sdk/issues/3432/events
     * html_url : https://github.com/firebase/firebase-ios-sdk/issues/3432
     * id : 472639347
     * node_id : MDU6SXNzdWU0NzI2MzkzNDc=
     * number : 3432
     * title : FirebaseFirestore not setting data using Rome dependencies + Xcodegen
     * user : {"login":"DrewKiino","id":13005359,"node_id":"MDQ6VXNlcjEzMDA1MzU5","avatar_url":"https://avatars1.githubusercontent.com/u/13005359?v=4","gravatar_id":"","url":"https://api.github.com/users/DrewKiino","html_url":"https://github.com/DrewKiino","followers_url":"https://api.github.com/users/DrewKiino/followers","following_url":"https://api.github.com/users/DrewKiino/following{/other_user}","gists_url":"https://api.github.com/users/DrewKiino/gists{/gist_id}","starred_url":"https://api.github.com/users/DrewKiino/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/DrewKiino/subscriptions","organizations_url":"https://api.github.com/users/DrewKiino/orgs","repos_url":"https://api.github.com/users/DrewKiino/repos","events_url":"https://api.github.com/users/DrewKiino/events{/privacy}","received_events_url":"https://api.github.com/users/DrewKiino/received_events","type":"User","site_admin":false}
     * labels : [{"id":713434153,"node_id":"MDU6TGFiZWw3MTM0MzQxNTM=","url":"https://api.github.com/repos/firebase/firebase-ios-sdk/labels/api:%20firestore","name":"api: firestore","color":"c5def5","default":false}]
     * state : open
     * locked : false
     * assignee : null
     * assignees : []
     * milestone : null
     * comments : 0
     * created_at : 2019-07-25T02:54:46Z
     * updated_at : 2019-07-25T02:54:47Z
     * closed_at : null
     * author_association : NONE
     * body : ### [READ] Step 1: Are you in the right place?

     yes.

     ### [REQUIRED] Step 2: Describe your environment
     * Xcode version: 10.2.1
     * Firebase SDK version: 6.5.0
     * Firebase Component: Firestore
     * Component version: 6.5.0

     ### [REQUIRED] Step 3: Describe the problem

     I used [Rome](https://github.com/CocoaPods/Rome) to download and build the external frameworks I needed for Firebase. This is what I have in my pod file
     ```
     pod 'Firebase'
     pod 'Firebase/Auth'
     pod 'Firebase/Analytics'
     pod 'Firebase/Core'
     pod 'Firebase/Firestore'
     ```

     then I used [Xcodegen](https://github.com/yonaskolb/XcodeGen) to generate the project with firebase as a targets template.
     ```yml
     targets:
     Firebase2:
     transitivelyLinkDependencies: true
     dependencies:
     - {embed: false, framework: Rome/FIRAnalyticsConnector.framework}
     - {embed: false, framework: Rome/FirebaseAnalytics.framework}
     - {embed: false, framework: Rome/FirebaseCore.framework}
     - {embed: false, framework: Rome/FirebaseCoreDiagnostics.framework}
     - {embed: false, framework: Rome/FirebaseFirestore.framework}
     - {embed: false, framework: Rome/FirebaseInstanceID.framework}
     - {embed: false, framework: Rome/GoogleAppMeasurement.framework}
     - {embed: true, framework: Rome/GoogleUtilities.framework}
     - {embed: true, framework: Rome/grpc.framework}
     - {embed: true, framework: Rome/grpcpp.framework}
     - {embed: true, framework: Rome/leveldb.framework}
     - {embed: true, framework: Rome/nanopb.framework}
     - {embed: true, framework: Rome/openssl_grpc.framework}
     - {embed: false, framework: Rome/Protobuf.framework}
     ```
     you can see that some are embedded and some are not, I followed the manual import outlined in the firebase website.

     I ran my view controller with this code
     ```swift
     func viewDidLoad() {
     FirebaseConfiguration.shared.setLoggerLevel(.max)

     Firestore.enableLogging(true)

     //    Auth.auth().createUser(withEmail: "drew@gmail.com", password: "testpass") { result, error in
     //      if let error = error {
     //        print(error)
     //      } else if let result = result {
     //        print(result)
     //      }
     //    }

     let docData: [String: Any] = [
     "stringExample": "Hello world!",
     "booleanExample": true,
     "numberExample": 3.14159265,
     "dateExample": Timestamp(date: Date()),
     "arrayExample": [5, true, "hello"],
     "nullExample": NSNull(),
     "objectExample": [
     "a": 5,
     "b": [
     "nested": "foo"
     ]
     ]
     ]

     print("Writing documents")

     firestore.collection("data").getDocuments { snapshot, error in
     if let error = error {
     print(error)
     } else if let snapshop = snapshot {
     print(snapshop)
     }
     }
     }
     ```
     basically uncommenting `Auth` I actually get a response back so I know for sure it's just `Firestore`. So when I run this code, I get `Writing Documents` but never a call back for the inner prints.

     I did logging and enabling OS_ACTIVITY_MODE and I don't see any prints whatsoever.
     It's like the function itself never gets called at all. I can't really put break points in the SDK itself because it's framework based and all I get are headers.

     need some help here :(

     #### Steps to reproduce:

     1. make a dummy project and an associated firebase app with the plist
     2. pod install using Rome to create your frameworks using the above podspec
     3. use xcodegen to link the dependencies and generate the xcodeproject
     4. use the above code and try to set data into firebase
     5. see that it's not doing it?????
     * pull_request : {"url":"https://api.github.com/repos/firebase/firebase-ios-sdk/pulls/3431","html_url":"https://github.com/firebase/firebase-ios-sdk/pull/3431","diff_url":"https://github.com/firebase/firebase-ios-sdk/pull/3431.diff","patch_url":"https://github.com/firebase/firebase-ios-sdk/pull/3431.patch"}
     */

    private String url;
    private String repository_url;
    private String labels_url;
    private String comments_url;
    private String events_url;
    private String html_url;
    private int id;
    private String node_id;
    private int number;
    private String title;
    private UserBean user;
    private String state;
    private boolean locked;
    private Object assignee;
    private Object milestone;
    private int comments;
    private String created_at;
    private String updated_at;
    private Object closed_at;
    private String author_association;
    private String body;
    private PullRequestBean pull_request;
    private List<LabelsBean> labels;
    private List<?> assignees;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepository_url() {
        return repository_url;
    }

    public void setRepository_url(String repository_url) {
        this.repository_url = repository_url;
    }

    public String getLabels_url() {
        return labels_url;
    }

    public void setLabels_url(String labels_url) {
        this.labels_url = labels_url;
    }

    public String getComments_url() {
        return comments_url;
    }

    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Object getAssignee() {
        return assignee;
    }

    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    public Object getMilestone() {
        return milestone;
    }

    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
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

    public Object getClosed_at() {
        return closed_at;
    }

    public void setClosed_at(Object closed_at) {
        this.closed_at = closed_at;
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

    public PullRequestBean getPull_request() {
        return pull_request;
    }

    public void setPull_request(PullRequestBean pull_request) {
        this.pull_request = pull_request;
    }

    public List<LabelsBean> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelsBean> labels) {
        this.labels = labels;
    }

    public List<?> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<?> assignees) {
        this.assignees = assignees;
    }

    public static class UserBean {
        /**
         * login : DrewKiino
         * id : 13005359
         * node_id : MDQ6VXNlcjEzMDA1MzU5
         * avatar_url : https://avatars1.githubusercontent.com/u/13005359?v=4
         * gravatar_id :
         * url : https://api.github.com/users/DrewKiino
         * html_url : https://github.com/DrewKiino
         * followers_url : https://api.github.com/users/DrewKiino/followers
         * following_url : https://api.github.com/users/DrewKiino/following{/other_user}
         * gists_url : https://api.github.com/users/DrewKiino/gists{/gist_id}
         * starred_url : https://api.github.com/users/DrewKiino/starred{/owner}{/repo}
         * subscriptions_url : https://api.github.com/users/DrewKiino/subscriptions
         * organizations_url : https://api.github.com/users/DrewKiino/orgs
         * repos_url : https://api.github.com/users/DrewKiino/repos
         * events_url : https://api.github.com/users/DrewKiino/events{/privacy}
         * received_events_url : https://api.github.com/users/DrewKiino/received_events
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

    public static class PullRequestBean {
        /**
         * url : https://api.github.com/repos/firebase/firebase-ios-sdk/pulls/3431
         * html_url : https://github.com/firebase/firebase-ios-sdk/pull/3431
         * diff_url : https://github.com/firebase/firebase-ios-sdk/pull/3431.diff
         * patch_url : https://github.com/firebase/firebase-ios-sdk/pull/3431.patch
         */

        private String url;
        private String html_url;
        private String diff_url;
        private String patch_url;

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

        public String getDiff_url() {
            return diff_url;
        }

        public void setDiff_url(String diff_url) {
            this.diff_url = diff_url;
        }

        public String getPatch_url() {
            return patch_url;
        }

        public void setPatch_url(String patch_url) {
            this.patch_url = patch_url;
        }
    }

    public static class LabelsBean {
        /**
         * id : 713434153
         * node_id : MDU6TGFiZWw3MTM0MzQxNTM=
         * url : https://api.github.com/repos/firebase/firebase-ios-sdk/labels/api:%20firestore
         * name : api: firestore
         * color : c5def5
         * default : false
         */

        private int id;
        private String node_id;
        private String url;
        private String name;
        private String color;
        @SerializedName("default")
        private boolean defaultX;

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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isDefaultX() {
            return defaultX;
        }

        public void setDefaultX(boolean defaultX) {
            this.defaultX = defaultX;
        }
    }
}
