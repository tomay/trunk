package org.rebioma.server.services;

// Generated Feb 25, 2009 3:19:41 PM by Hibernate Tools 3.2.4.CR1

/**
 * Collaborators generated by hbm2java
 */
public class Collaborators implements java.io.Serializable {

  private int id;
  private int userId;
  private int friendId;

  public Collaborators() {
  }

  public Collaborators(int userId, int friendId) {
    this.userId = userId;
    this.friendId = friendId;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getUserId() {
    return this.userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getFriendId() {
    return this.friendId;
  }

  public void setFriendId(int friendId) {
    this.friendId = friendId;
  }

}
