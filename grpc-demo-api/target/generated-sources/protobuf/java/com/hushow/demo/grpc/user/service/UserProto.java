// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_service.proto

package com.hushow.demo.grpc.user.service;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022user_service.proto\022\035com.hushow.demo.gr" +
      "pc.user.dto\032\016user_dto.proto2\304\002\n\004User\022i\n\004" +
      "list\0220.com.hushow.demo.grpc.user.dto.Sea" +
      "rchUserRequest\032+.com.hushow.demo.grpc.us" +
      "er.dto.UserResponse\"\0000\001\022c\n\003add\022-.com.hus" +
      "how.demo.grpc.user.dto.AddUserRequest\032+." +
      "com.hushow.demo.grpc.user.dto.UserRespon" +
      "se\"\000\022l\n\010addBatch\022-.com.hushow.demo.grpc." +
      "user.dto.AddUserRequest\032+.com.hushow.dem" +
      "o.grpc.user.dto.UserResponse\"\000(\0010\001B0\n!co" +
      "m.hushow.demo.grpc.user.serviceB\tUserPro" +
      "toP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.hushow.demo.grpc.user.dto.UserDto.getDescriptor(),
        });
    com.hushow.demo.grpc.user.dto.UserDto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}