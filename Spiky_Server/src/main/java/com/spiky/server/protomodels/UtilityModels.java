// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UtilityModels.proto

package com.spiky.server.protomodels;

public final class UtilityModels {
  private UtilityModels() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UtilityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Utility)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool alive = 1;</code>
     */
    boolean getAlive();
  }
  /**
   * Protobuf type {@code Utility}
   */
  public  static final class Utility extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Utility)
      UtilityOrBuilder {
    // Use Utility.newBuilder() to construct.
    private Utility(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Utility() {
      alive_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Utility(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              alive_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.spiky.server.protomodels.UtilityModels.internal_static_Utility_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.spiky.server.protomodels.UtilityModels.internal_static_Utility_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.spiky.server.protomodels.UtilityModels.Utility.class, com.spiky.server.protomodels.UtilityModels.Utility.Builder.class);
    }

    public static final int ALIVE_FIELD_NUMBER = 1;
    private boolean alive_;
    /**
     * <code>optional bool alive = 1;</code>
     */
    public boolean getAlive() {
      return alive_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (alive_ != false) {
        output.writeBool(1, alive_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (alive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, alive_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.spiky.server.protomodels.UtilityModels.Utility)) {
        return super.equals(obj);
      }
      com.spiky.server.protomodels.UtilityModels.Utility other = (com.spiky.server.protomodels.UtilityModels.Utility) obj;

      boolean result = true;
      result = result && (getAlive()
          == other.getAlive());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + ALIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAlive());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.spiky.server.protomodels.UtilityModels.Utility parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spiky.server.protomodels.UtilityModels.Utility parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spiky.server.protomodels.UtilityModels.Utility parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spiky.server.protomodels.UtilityModels.Utility parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spiky.server.protomodels.UtilityModels.Utility parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.spiky.server.protomodels.UtilityModels.Utility parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.spiky.server.protomodels.UtilityModels.Utility parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.spiky.server.protomodels.UtilityModels.Utility parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.spiky.server.protomodels.UtilityModels.Utility parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.spiky.server.protomodels.UtilityModels.Utility parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.spiky.server.protomodels.UtilityModels.Utility prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Utility}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Utility)
        com.spiky.server.protomodels.UtilityModels.UtilityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.spiky.server.protomodels.UtilityModels.internal_static_Utility_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.spiky.server.protomodels.UtilityModels.internal_static_Utility_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.spiky.server.protomodels.UtilityModels.Utility.class, com.spiky.server.protomodels.UtilityModels.Utility.Builder.class);
      }

      // Construct using com.spiky.server.protomodels.UtilityModels.Utility.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        alive_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.spiky.server.protomodels.UtilityModels.internal_static_Utility_descriptor;
      }

      public com.spiky.server.protomodels.UtilityModels.Utility getDefaultInstanceForType() {
        return com.spiky.server.protomodels.UtilityModels.Utility.getDefaultInstance();
      }

      public com.spiky.server.protomodels.UtilityModels.Utility build() {
        com.spiky.server.protomodels.UtilityModels.Utility result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.spiky.server.protomodels.UtilityModels.Utility buildPartial() {
        com.spiky.server.protomodels.UtilityModels.Utility result = new com.spiky.server.protomodels.UtilityModels.Utility(this);
        result.alive_ = alive_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.spiky.server.protomodels.UtilityModels.Utility) {
          return mergeFrom((com.spiky.server.protomodels.UtilityModels.Utility)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.spiky.server.protomodels.UtilityModels.Utility other) {
        if (other == com.spiky.server.protomodels.UtilityModels.Utility.getDefaultInstance()) return this;
        if (other.getAlive() != false) {
          setAlive(other.getAlive());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.spiky.server.protomodels.UtilityModels.Utility parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.spiky.server.protomodels.UtilityModels.Utility) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean alive_ ;
      /**
       * <code>optional bool alive = 1;</code>
       */
      public boolean getAlive() {
        return alive_;
      }
      /**
       * <code>optional bool alive = 1;</code>
       */
      public Builder setAlive(boolean value) {
        
        alive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool alive = 1;</code>
       */
      public Builder clearAlive() {
        
        alive_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:Utility)
    }

    // @@protoc_insertion_point(class_scope:Utility)
    private static final com.spiky.server.protomodels.UtilityModels.Utility DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.spiky.server.protomodels.UtilityModels.Utility();
    }

    public static com.spiky.server.protomodels.UtilityModels.Utility getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Utility>
        PARSER = new com.google.protobuf.AbstractParser<Utility>() {
      public Utility parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Utility(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Utility> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Utility> getParserForType() {
      return PARSER;
    }

    public com.spiky.server.protomodels.UtilityModels.Utility getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Utility_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Utility_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023UtilityModels.proto\032\025DisableWarnings.p" +
      "roto\"\030\n\007Utility\022\r\n\005alive\030\001 \001(\010B-\n\034com.sp" +
      "iky.server.protomodelsB\rUtilityModelsb\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.spiky.server.protomodels.DisableWarnings.getDescriptor(),
        }, assigner);
    internal_static_Utility_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Utility_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Utility_descriptor,
        new java.lang.String[] { "Alive", });
    com.spiky.server.protomodels.DisableWarnings.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
