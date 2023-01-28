// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForceAddPlayerFriendRsp.proto

public final class ForceAddPlayerFriendRspOuterClass {
  private ForceAddPlayerFriendRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ForceAddPlayerFriendRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ForceAddPlayerFriendRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FriendBrief targetFriendBrief = 12;</code>
     * @return Whether the targetFriendBrief field is set.
     */
    boolean hasTargetFriendBrief();
    /**
     * <code>.FriendBrief targetFriendBrief = 12;</code>
     * @return The targetFriendBrief.
     */
    FriendBriefOuterClass.FriendBrief getTargetFriendBrief();
    /**
     * <code>.FriendBrief targetFriendBrief = 12;</code>
     */
    FriendBriefOuterClass.FriendBriefOrBuilder getTargetFriendBriefOrBuilder();

    /**
     * <code>uint32 targetUid = 14;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code ForceAddPlayerFriendRsp}
   */
  public static final class ForceAddPlayerFriendRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ForceAddPlayerFriendRsp)
      ForceAddPlayerFriendRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ForceAddPlayerFriendRsp.newBuilder() to construct.
    private ForceAddPlayerFriendRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ForceAddPlayerFriendRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ForceAddPlayerFriendRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ForceAddPlayerFriendRsp(
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
            case 88: {

              retcode_ = input.readInt32();
              break;
            }
            case 98: {
              FriendBriefOuterClass.FriendBrief.Builder subBuilder = null;
              if (targetFriendBrief_ != null) {
                subBuilder = targetFriendBrief_.toBuilder();
              }
              targetFriendBrief_ = input.readMessage(FriendBriefOuterClass.FriendBrief.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(targetFriendBrief_);
                targetFriendBrief_ = subBuilder.buildPartial();
              }

              break;
            }
            case 112: {

              targetUid_ = input.readUInt32();
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
      return ForceAddPlayerFriendRspOuterClass.internal_static_ForceAddPlayerFriendRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ForceAddPlayerFriendRspOuterClass.internal_static_ForceAddPlayerFriendRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.class, ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code ForceAddPlayerFriendRsp.NFIMNEOOLPH}
     */
    public enum NFIMNEOOLPH
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4054;</code>
       */
      PEPPOHPHJOJ(1, 4054),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final NFIMNEOOLPH DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4054;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4054;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static NFIMNEOOLPH valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static NFIMNEOOLPH forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4054: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<NFIMNEOOLPH>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          NFIMNEOOLPH> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<NFIMNEOOLPH>() {
              public NFIMNEOOLPH findValueByNumber(int number) {
                return NFIMNEOOLPH.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final NFIMNEOOLPH[] VALUES = getStaticValuesArray();
      private static NFIMNEOOLPH[] getStaticValuesArray() {
        return new NFIMNEOOLPH[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static NFIMNEOOLPH valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private NFIMNEOOLPH(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ForceAddPlayerFriendRsp.NFIMNEOOLPH)
    }

    public static final int TARGETFRIENDBRIEF_FIELD_NUMBER = 12;
    private FriendBriefOuterClass.FriendBrief targetFriendBrief_;
    /**
     * <code>.FriendBrief targetFriendBrief = 12;</code>
     * @return Whether the targetFriendBrief field is set.
     */
    @java.lang.Override
    public boolean hasTargetFriendBrief() {
      return targetFriendBrief_ != null;
    }
    /**
     * <code>.FriendBrief targetFriendBrief = 12;</code>
     * @return The targetFriendBrief.
     */
    @java.lang.Override
    public FriendBriefOuterClass.FriendBrief getTargetFriendBrief() {
      return targetFriendBrief_ == null ? FriendBriefOuterClass.FriendBrief.getDefaultInstance() : targetFriendBrief_;
    }
    /**
     * <code>.FriendBrief targetFriendBrief = 12;</code>
     */
    @java.lang.Override
    public FriendBriefOuterClass.FriendBriefOrBuilder getTargetFriendBriefOrBuilder() {
      return getTargetFriendBrief();
    }

    public static final int TARGETUID_FIELD_NUMBER = 14;
    private int targetUid_;
    /**
     * <code>uint32 targetUid = 14;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      if (targetFriendBrief_ != null) {
        output.writeMessage(12, getTargetFriendBrief());
      }
      if (targetUid_ != 0) {
        output.writeUInt32(14, targetUid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      if (targetFriendBrief_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getTargetFriendBrief());
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, targetUid_);
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
      if (!(obj instanceof ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp)) {
        return super.equals(obj);
      }
      ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp other = (ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp) obj;

      if (hasTargetFriendBrief() != other.hasTargetFriendBrief()) return false;
      if (hasTargetFriendBrief()) {
        if (!getTargetFriendBrief()
            .equals(other.getTargetFriendBrief())) return false;
      }
      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (hasTargetFriendBrief()) {
        hash = (37 * hash) + TARGETFRIENDBRIEF_FIELD_NUMBER;
        hash = (53 * hash) + getTargetFriendBrief().hashCode();
      }
      hash = (37 * hash) + TARGETUID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
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
    public static Builder newBuilder(ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp prototype) {
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
     * Protobuf type {@code ForceAddPlayerFriendRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ForceAddPlayerFriendRsp)
        ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ForceAddPlayerFriendRspOuterClass.internal_static_ForceAddPlayerFriendRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ForceAddPlayerFriendRspOuterClass.internal_static_ForceAddPlayerFriendRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.class, ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.Builder.class);
      }

      // Construct using ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.newBuilder()
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
        if (targetFriendBriefBuilder_ == null) {
          targetFriendBrief_ = null;
        } else {
          targetFriendBrief_ = null;
          targetFriendBriefBuilder_ = null;
        }
        targetUid_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ForceAddPlayerFriendRspOuterClass.internal_static_ForceAddPlayerFriendRsp_descriptor;
      }

      @java.lang.Override
      public ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp getDefaultInstanceForType() {
        return ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.getDefaultInstance();
      }

      @java.lang.Override
      public ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp build() {
        ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp buildPartial() {
        ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp result = new ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp(this);
        if (targetFriendBriefBuilder_ == null) {
          result.targetFriendBrief_ = targetFriendBrief_;
        } else {
          result.targetFriendBrief_ = targetFriendBriefBuilder_.build();
        }
        result.targetUid_ = targetUid_;
        result.retcode_ = retcode_;
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
        if (other instanceof ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp) {
          return mergeFrom((ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp other) {
        if (other == ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.getDefaultInstance()) return this;
        if (other.hasTargetFriendBrief()) {
          mergeTargetFriendBrief(other.getTargetFriendBrief());
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private FriendBriefOuterClass.FriendBrief targetFriendBrief_;
      private com.google.protobuf.SingleFieldBuilderV3<
          FriendBriefOuterClass.FriendBrief, FriendBriefOuterClass.FriendBrief.Builder, FriendBriefOuterClass.FriendBriefOrBuilder> targetFriendBriefBuilder_;
      /**
       * <code>.FriendBrief targetFriendBrief = 12;</code>
       * @return Whether the targetFriendBrief field is set.
       */
      public boolean hasTargetFriendBrief() {
        return targetFriendBriefBuilder_ != null || targetFriendBrief_ != null;
      }
      /**
       * <code>.FriendBrief targetFriendBrief = 12;</code>
       * @return The targetFriendBrief.
       */
      public FriendBriefOuterClass.FriendBrief getTargetFriendBrief() {
        if (targetFriendBriefBuilder_ == null) {
          return targetFriendBrief_ == null ? FriendBriefOuterClass.FriendBrief.getDefaultInstance() : targetFriendBrief_;
        } else {
          return targetFriendBriefBuilder_.getMessage();
        }
      }
      /**
       * <code>.FriendBrief targetFriendBrief = 12;</code>
       */
      public Builder setTargetFriendBrief(FriendBriefOuterClass.FriendBrief value) {
        if (targetFriendBriefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetFriendBrief_ = value;
          onChanged();
        } else {
          targetFriendBriefBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FriendBrief targetFriendBrief = 12;</code>
       */
      public Builder setTargetFriendBrief(
          FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (targetFriendBriefBuilder_ == null) {
          targetFriendBrief_ = builderForValue.build();
          onChanged();
        } else {
          targetFriendBriefBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FriendBrief targetFriendBrief = 12;</code>
       */
      public Builder mergeTargetFriendBrief(FriendBriefOuterClass.FriendBrief value) {
        if (targetFriendBriefBuilder_ == null) {
          if (targetFriendBrief_ != null) {
            targetFriendBrief_ =
              FriendBriefOuterClass.FriendBrief.newBuilder(targetFriendBrief_).mergeFrom(value).buildPartial();
          } else {
            targetFriendBrief_ = value;
          }
          onChanged();
        } else {
          targetFriendBriefBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FriendBrief targetFriendBrief = 12;</code>
       */
      public Builder clearTargetFriendBrief() {
        if (targetFriendBriefBuilder_ == null) {
          targetFriendBrief_ = null;
          onChanged();
        } else {
          targetFriendBrief_ = null;
          targetFriendBriefBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FriendBrief targetFriendBrief = 12;</code>
       */
      public FriendBriefOuterClass.FriendBrief.Builder getTargetFriendBriefBuilder() {
        
        onChanged();
        return getTargetFriendBriefFieldBuilder().getBuilder();
      }
      /**
       * <code>.FriendBrief targetFriendBrief = 12;</code>
       */
      public FriendBriefOuterClass.FriendBriefOrBuilder getTargetFriendBriefOrBuilder() {
        if (targetFriendBriefBuilder_ != null) {
          return targetFriendBriefBuilder_.getMessageOrBuilder();
        } else {
          return targetFriendBrief_ == null ?
              FriendBriefOuterClass.FriendBrief.getDefaultInstance() : targetFriendBrief_;
        }
      }
      /**
       * <code>.FriendBrief targetFriendBrief = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          FriendBriefOuterClass.FriendBrief, FriendBriefOuterClass.FriendBrief.Builder, FriendBriefOuterClass.FriendBriefOrBuilder> 
          getTargetFriendBriefFieldBuilder() {
        if (targetFriendBriefBuilder_ == null) {
          targetFriendBriefBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              FriendBriefOuterClass.FriendBrief, FriendBriefOuterClass.FriendBrief.Builder, FriendBriefOuterClass.FriendBriefOrBuilder>(
                  getTargetFriendBrief(),
                  getParentForChildren(),
                  isClean());
          targetFriendBrief_ = null;
        }
        return targetFriendBriefBuilder_;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 targetUid = 14;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 targetUid = 14;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 targetUid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ForceAddPlayerFriendRsp)
    }

    // @@protoc_insertion_point(class_scope:ForceAddPlayerFriendRsp)
    private static final ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp();
    }

    public static ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ForceAddPlayerFriendRsp>
        PARSER = new com.google.protobuf.AbstractParser<ForceAddPlayerFriendRsp>() {
      @java.lang.Override
      public ForceAddPlayerFriendRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ForceAddPlayerFriendRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ForceAddPlayerFriendRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ForceAddPlayerFriendRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForceAddPlayerFriendRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForceAddPlayerFriendRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ForceAddPlayerFriendRsp.proto\032\021FriendB" +
      "rief.proto\"\267\001\n\027ForceAddPlayerFriendRsp\022\'" +
      "\n\021targetFriendBrief\030\014 \001(\0132\014.FriendBrief\022" +
      "\021\n\ttargetUid\030\016 \001(\r\022\017\n\007retcode\030\013 \001(\005\"O\n\013N" +
      "FIMNEOOLPH\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\326\037\022\017" +
      "\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          FriendBriefOuterClass.getDescriptor(),
        });
    internal_static_ForceAddPlayerFriendRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ForceAddPlayerFriendRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForceAddPlayerFriendRsp_descriptor,
        new java.lang.String[] { "TargetFriendBrief", "TargetUid", "Retcode", });
    FriendBriefOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
