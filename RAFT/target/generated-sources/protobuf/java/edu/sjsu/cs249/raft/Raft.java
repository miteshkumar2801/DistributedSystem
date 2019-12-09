// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package edu.sjsu.cs249.raft;

public final class Raft {
  private Raft() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_RequestVoteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_raft_RequestVoteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_RequestVoteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_raft_RequestVoteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_AppendEntriesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_raft_AppendEntriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_AppendEntriesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_raft_AppendEntriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_Entry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_raft_Entry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_ClientAppendRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_raft_ClientAppendRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_ClientAppendResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_raft_ClientAppendResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_ClientRequestIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_raft_ClientRequestIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_ClientRequestIndexResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_raft_ClientRequestIndexResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nraft.proto\022\004raft\"a\n\022RequestVoteRequest" +
      "\022\014\n\004term\030\001 \001(\004\022\022\n\ncadidateId\030\002 \001(\r\022\024\n\014la" +
      "stLogIndex\030\003 \001(\004\022\023\n\013lastLogTerm\030\004 \001(\004\"8\n" +
      "\023RequestVoteResponse\022\014\n\004term\030\001 \001(\004\022\023\n\013vo" +
      "teGranted\030\002 \001(\010\"\223\001\n\024AppendEntriesRequest" +
      "\022\014\n\004term\030\001 \001(\004\022\020\n\010leaderId\030\002 \001(\r\022\024\n\014prev" +
      "LogIndex\030\003 \001(\004\022\023\n\013prevLogTerm\030\004 \001(\004\022\032\n\005e" +
      "ntry\030\005 \001(\0132\013.raft.Entry\022\024\n\014leaderCommit\030" +
      "\006 \001(\004\"6\n\025AppendEntriesResponse\022\014\n\004term\030\001" +
      " \001(\004\022\017\n\007success\030\002 \001(\010\"4\n\005Entry\022\014\n\004term\030\001" +
      " \001(\004\022\r\n\005index\030\002 \001(\004\022\016\n\006decree\030\003 \001(\t\"%\n\023C" +
      "lientAppendRequest\022\016\n\006decree\030\001 \001(\t\"A\n\024Cl" +
      "ientAppendResponse\022\n\n\002rc\030\001 \001(\r\022\016\n\006leader" +
      "\030\002 \001(\004\022\r\n\005index\030\003 \001(\004\"*\n\031ClientRequestIn" +
      "dexRequest\022\r\n\005index\030\001 \001(\004\"W\n\032ClientReque" +
      "stIndexResponse\022\n\n\002rc\030\001 \001(\r\022\016\n\006leader\030\002 " +
      "\001(\004\022\r\n\005index\030\003 \001(\004\022\016\n\006decree\030\004 \001(\t2\272\002\n\nR" +
      "aftServer\022B\n\013RequestVote\022\030.raft.RequestV" +
      "oteRequest\032\031.raft.RequestVoteResponse\022H\n" +
      "\rAppendEntries\022\032.raft.AppendEntriesReque" +
      "st\032\033.raft.AppendEntriesResponse\022E\n\014Clien" +
      "tAppend\022\031.raft.ClientAppendRequest\032\032.raf" +
      "t.ClientAppendResponse\022W\n\022ClientRequestI" +
      "ndex\022\037.raft.ClientRequestIndexRequest\032 ." +
      "raft.ClientRequestIndexResponseB\027\n\023edu.s" +
      "jsu.cs249.raftP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_raft_RequestVoteRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_raft_RequestVoteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_raft_RequestVoteRequest_descriptor,
        new java.lang.String[] { "Term", "CadidateId", "LastLogIndex", "LastLogTerm", });
    internal_static_raft_RequestVoteResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_raft_RequestVoteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_raft_RequestVoteResponse_descriptor,
        new java.lang.String[] { "Term", "VoteGranted", });
    internal_static_raft_AppendEntriesRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_raft_AppendEntriesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_raft_AppendEntriesRequest_descriptor,
        new java.lang.String[] { "Term", "LeaderId", "PrevLogIndex", "PrevLogTerm", "Entry", "LeaderCommit", });
    internal_static_raft_AppendEntriesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_raft_AppendEntriesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_raft_AppendEntriesResponse_descriptor,
        new java.lang.String[] { "Term", "Success", });
    internal_static_raft_Entry_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_raft_Entry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_raft_Entry_descriptor,
        new java.lang.String[] { "Term", "Index", "Decree", });
    internal_static_raft_ClientAppendRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_raft_ClientAppendRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_raft_ClientAppendRequest_descriptor,
        new java.lang.String[] { "Decree", });
    internal_static_raft_ClientAppendResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_raft_ClientAppendResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_raft_ClientAppendResponse_descriptor,
        new java.lang.String[] { "Rc", "Leader", "Index", });
    internal_static_raft_ClientRequestIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_raft_ClientRequestIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_raft_ClientRequestIndexRequest_descriptor,
        new java.lang.String[] { "Index", });
    internal_static_raft_ClientRequestIndexResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_raft_ClientRequestIndexResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_raft_ClientRequestIndexResponse_descriptor,
        new java.lang.String[] { "Rc", "Leader", "Index", "Decree", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}