// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGInviteBattleNotify.proto

package emu.grasscutter.net.proto;

public final class GCGInviteBattleNotifyOuterClass {
  private GCGInviteBattleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGInviteBattleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGInviteBattleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 confirm_end_time = 1;</code>
     * @return The confirmEndTime.
     */
    int getConfirmEndTime();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7448;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGInviteBattleNotify}
   */
  public static final class GCGInviteBattleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGInviteBattleNotify)
      GCGInviteBattleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGInviteBattleNotify.newBuilder() to construct.
    private GCGInviteBattleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGInviteBattleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGInviteBattleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGInviteBattleNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              confirmEndTime_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.internal_static_GCGInviteBattleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.internal_static_GCGInviteBattleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify.class, emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify.Builder.class);
    }

    public static final int CONFIRM_END_TIME_FIELD_NUMBER = 1;
    private int confirmEndTime_;
    /**
     * <code>uint32 confirm_end_time = 1;</code>
     * @return The confirmEndTime.
     */
    @java.lang.Override
    public int getConfirmEndTime() {
      return confirmEndTime_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (confirmEndTime_ != 0) {
        output.writeUInt32(1, confirmEndTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (confirmEndTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, confirmEndTime_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify other = (emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify) obj;

      if (getConfirmEndTime()
          != other.getConfirmEndTime()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CONFIRM_END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getConfirmEndTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 7448;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGInviteBattleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGInviteBattleNotify)
        emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.internal_static_GCGInviteBattleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.internal_static_GCGInviteBattleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify.class, emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        confirmEndTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.internal_static_GCGInviteBattleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify build() {
        emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify buildPartial() {
        emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify result = new emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify(this);
        result.confirmEndTime_ = confirmEndTime_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify other) {
        if (other == emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify.getDefaultInstance()) return this;
        if (other.getConfirmEndTime() != 0) {
          setConfirmEndTime(other.getConfirmEndTime());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int confirmEndTime_ ;
      /**
       * <code>uint32 confirm_end_time = 1;</code>
       * @return The confirmEndTime.
       */
      @java.lang.Override
      public int getConfirmEndTime() {
        return confirmEndTime_;
      }
      /**
       * <code>uint32 confirm_end_time = 1;</code>
       * @param value The confirmEndTime to set.
       * @return This builder for chaining.
       */
      public Builder setConfirmEndTime(int value) {
        
        confirmEndTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 confirm_end_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfirmEndTime() {
        
        confirmEndTime_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GCGInviteBattleNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGInviteBattleNotify)
    private static final emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify();
    }

    public static emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGInviteBattleNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGInviteBattleNotify>() {
      @java.lang.Override
      public GCGInviteBattleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGInviteBattleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGInviteBattleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGInviteBattleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGInviteBattleNotifyOuterClass.GCGInviteBattleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGInviteBattleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGInviteBattleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033GCGInviteBattleNotify.proto\"1\n\025GCGInvi" +
      "teBattleNotify\022\030\n\020confirm_end_time\030\001 \001(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGInviteBattleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGInviteBattleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGInviteBattleNotify_descriptor,
        new java.lang.String[] { "ConfirmEndTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
