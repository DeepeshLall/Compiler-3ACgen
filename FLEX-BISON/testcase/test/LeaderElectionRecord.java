package io.kubernetes.client.extended.leaderelection;

import java.util.Date;

public class LeaderElectionRecord {

  private String holderIdentity;

  private int leaseDurationSeconds;

  private Date acquireTime;

  private Date renewTime;

  private int leaderTransitions;

  public LeaderElectionRecord() {}

  public LeaderElectionRecord(
      String holderIdentity,
      int leaseDurationSeconds,
      Date acquireTime,
      Date renewTime,
      int leaderTransitions) {
    this.holderIdentity = holderIdentity;
    this.leaseDurationSeconds = leaseDurationSeconds;
    this.acquireTime = acquireTime;
    this.renewTime = renewTime;
    this.leaderTransitions = leaderTransitions;
  }

  public String getHolderIdentity() {
    return holderIdentity;
  }

  public void setHolderIdentity(String holderIdentity) {
    this.holderIdentity = holderIdentity;
  }

  public int getLeaseDurationSeconds() {
    return leaseDurationSeconds;
  }

  public void setLeaseDurationSeconds(int leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
  }

  public Date getAcquireTime() {
    return acquireTime;
  }

  public void setAcquireTime(Date acquireTime) {
    this.acquireTime = acquireTime;
  }

  public Date getRenewTime() {
    return renewTime;
  }

  public void setRenewTime(Date renewTime) {
    this.renewTime = renewTime;
  }

  public int getLeaderTransitions() {
    return leaderTransitions;
  }

  public void setLeaderTransitions(int leaderTransitions) {
    this.leaderTransitions = leaderTransitions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof LeaderElectionRecord)) return false;

    LeaderElectionRecord that = (LeaderElectionRecord) o;

    if (leaseDurationSeconds != that.leaseDurationSeconds) return false;
    if (leaderTransitions != that.leaderTransitions) return false;
    if (holderIdentity == null) {
      if (that.holderIdentity != null) return false;
    } else {
      if (!holderIdentity.equals(that.holderIdentity)) return false;
    }
    if (acquireTime == null) {
      if (that.acquireTime != null) return false;
    } else {
      if (!acquireTime.equals(that.acquireTime)) return false;
    }
    if (renewTime == null) {
      return that.holderIdentity == null;
    }
    return renewTime.equals(that.renewTime);
  }
}
