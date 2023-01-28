// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityAcceptGiveGiftRsp.proto

public final class ActivityAcceptGiveGiftRspOuterClass {
  private ActivityAcceptGiveGiftRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityAcceptGiveGiftRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityAcceptGiveGiftRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scheduleId = 4;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
     * @return Whether the acceptGiftResultInfo field is set.
     */
    boolean hasAcceptGiftResultInfo();
    /**
     * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
     * @return The acceptGiftResultInfo.
     */
    ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo getAcceptGiftResultInfo();
    /**
     * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
     */
    ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfoOrBuilder getAcceptGiftResultInfoOrBuilder();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code ActivityAcceptGiveGiftRsp}
   */
  public static final class ActivityAcceptGiveGiftRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityAcceptGiveGiftRsp)
      ActivityAcceptGiveGiftRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityAcceptGiveGiftRsp.newBuilder() to construct.
    private ActivityAcceptGiveGiftRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityAcceptGiveGiftRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityAcceptGiveGiftRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityAcceptGiveGiftRsp(
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
            case 32: {

              scheduleId_ = input.readUInt32();
              break;
            }
            case 48: {

              retcode_ = input.readInt32();
              break;
            }
            case 74: {
              ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo.Builder subBuilder = null;
              if (acceptGiftResultInfo_ != null) {
                subBuilder = acceptGiftResultInfo_.toBuilder();
              }
              acceptGiftResultInfo_ = input.readMessage(ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(acceptGiftResultInfo_);
                acceptGiftResultInfo_ = subBuilder.buildPartial();
              }

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
      return ActivityAcceptGiveGiftRspOuterClass.internal_static_ActivityAcceptGiveGiftRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ActivityAcceptGiveGiftRspOuterClass.internal_static_ActivityAcceptGiveGiftRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp.class, ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code ActivityAcceptGiveGiftRsp.CKELMMOFJBG}
     */
    public enum CKELMMOFJBG
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 8235;</code>
       */
      PEPPOHPHJOJ(1, 8235),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final CKELMMOFJBG DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 8235;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 8235;
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
      public static CKELMMOFJBG valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CKELMMOFJBG forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 8235: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CKELMMOFJBG>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CKELMMOFJBG> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CKELMMOFJBG>() {
              public CKELMMOFJBG findValueByNumber(int number) {
                return CKELMMOFJBG.forNumber(number);
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
        return ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final CKELMMOFJBG[] VALUES = getStaticValuesArray();
      private static CKELMMOFJBG[] getStaticValuesArray() {
        return new CKELMMOFJBG[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static CKELMMOFJBG valueOf(
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

      private CKELMMOFJBG(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ActivityAcceptGiveGiftRsp.CKELMMOFJBG)
    }

    public static final int SCHEDULEID_FIELD_NUMBER = 4;
    private int scheduleId_;
    /**
     * <code>uint32 scheduleId = 4;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int ACCEPTGIFTRESULTINFO_FIELD_NUMBER = 9;
    private ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo acceptGiftResultInfo_;
    /**
     * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
     * @return Whether the acceptGiftResultInfo field is set.
     */
    @java.lang.Override
    public boolean hasAcceptGiftResultInfo() {
      return acceptGiftResultInfo_ != null;
    }
    /**
     * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
     * @return The acceptGiftResultInfo.
     */
    @java.lang.Override
    public ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo getAcceptGiftResultInfo() {
      return acceptGiftResultInfo_ == null ? ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo.getDefaultInstance() : acceptGiftResultInfo_;
    }
    /**
     * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
     */
    @java.lang.Override
    public ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfoOrBuilder getAcceptGiftResultInfoOrBuilder() {
      return getAcceptGiftResultInfo();
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
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
      if (scheduleId_ != 0) {
        output.writeUInt32(4, scheduleId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (acceptGiftResultInfo_ != null) {
        output.writeMessage(9, getAcceptGiftResultInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, scheduleId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (acceptGiftResultInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getAcceptGiftResultInfo());
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
      if (!(obj instanceof ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp)) {
        return super.equals(obj);
      }
      ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp other = (ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp) obj;

      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (hasAcceptGiftResultInfo() != other.hasAcceptGiftResultInfo()) return false;
      if (hasAcceptGiftResultInfo()) {
        if (!getAcceptGiftResultInfo()
            .equals(other.getAcceptGiftResultInfo())) return false;
      }
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
      hash = (37 * hash) + SCHEDULEID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      if (hasAcceptGiftResultInfo()) {
        hash = (37 * hash) + ACCEPTGIFTRESULTINFO_FIELD_NUMBER;
        hash = (53 * hash) + getAcceptGiftResultInfo().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp parseFrom(
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
    public static Builder newBuilder(ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp prototype) {
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
     * Protobuf type {@code ActivityAcceptGiveGiftRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityAcceptGiveGiftRsp)
        ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ActivityAcceptGiveGiftRspOuterClass.internal_static_ActivityAcceptGiveGiftRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ActivityAcceptGiveGiftRspOuterClass.internal_static_ActivityAcceptGiveGiftRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp.class, ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp.Builder.class);
      }

      // Construct using ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp.newBuilder()
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
        scheduleId_ = 0;

        if (acceptGiftResultInfoBuilder_ == null) {
          acceptGiftResultInfo_ = null;
        } else {
          acceptGiftResultInfo_ = null;
          acceptGiftResultInfoBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ActivityAcceptGiveGiftRspOuterClass.internal_static_ActivityAcceptGiveGiftRsp_descriptor;
      }

      @java.lang.Override
      public ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp getDefaultInstanceForType() {
        return ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp.getDefaultInstance();
      }

      @java.lang.Override
      public ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp build() {
        ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp buildPartial() {
        ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp result = new ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp(this);
        result.scheduleId_ = scheduleId_;
        if (acceptGiftResultInfoBuilder_ == null) {
          result.acceptGiftResultInfo_ = acceptGiftResultInfo_;
        } else {
          result.acceptGiftResultInfo_ = acceptGiftResultInfoBuilder_.build();
        }
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
        if (other instanceof ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp) {
          return mergeFrom((ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp other) {
        if (other == ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp.getDefaultInstance()) return this;
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (other.hasAcceptGiftResultInfo()) {
          mergeAcceptGiftResultInfo(other.getAcceptGiftResultInfo());
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
        ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 scheduleId = 4;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 scheduleId = 4;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scheduleId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo acceptGiftResultInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo, ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo.Builder, ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfoOrBuilder> acceptGiftResultInfoBuilder_;
      /**
       * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
       * @return Whether the acceptGiftResultInfo field is set.
       */
      public boolean hasAcceptGiftResultInfo() {
        return acceptGiftResultInfoBuilder_ != null || acceptGiftResultInfo_ != null;
      }
      /**
       * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
       * @return The acceptGiftResultInfo.
       */
      public ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo getAcceptGiftResultInfo() {
        if (acceptGiftResultInfoBuilder_ == null) {
          return acceptGiftResultInfo_ == null ? ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo.getDefaultInstance() : acceptGiftResultInfo_;
        } else {
          return acceptGiftResultInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
       */
      public Builder setAcceptGiftResultInfo(ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo value) {
        if (acceptGiftResultInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          acceptGiftResultInfo_ = value;
          onChanged();
        } else {
          acceptGiftResultInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
       */
      public Builder setAcceptGiftResultInfo(
          ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo.Builder builderForValue) {
        if (acceptGiftResultInfoBuilder_ == null) {
          acceptGiftResultInfo_ = builderForValue.build();
          onChanged();
        } else {
          acceptGiftResultInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
       */
      public Builder mergeAcceptGiftResultInfo(ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo value) {
        if (acceptGiftResultInfoBuilder_ == null) {
          if (acceptGiftResultInfo_ != null) {
            acceptGiftResultInfo_ =
              ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo.newBuilder(acceptGiftResultInfo_).mergeFrom(value).buildPartial();
          } else {
            acceptGiftResultInfo_ = value;
          }
          onChanged();
        } else {
          acceptGiftResultInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
       */
      public Builder clearAcceptGiftResultInfo() {
        if (acceptGiftResultInfoBuilder_ == null) {
          acceptGiftResultInfo_ = null;
          onChanged();
        } else {
          acceptGiftResultInfo_ = null;
          acceptGiftResultInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
       */
      public ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo.Builder getAcceptGiftResultInfoBuilder() {
        
        onChanged();
        return getAcceptGiftResultInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
       */
      public ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfoOrBuilder getAcceptGiftResultInfoOrBuilder() {
        if (acceptGiftResultInfoBuilder_ != null) {
          return acceptGiftResultInfoBuilder_.getMessageOrBuilder();
        } else {
          return acceptGiftResultInfo_ == null ?
              ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo.getDefaultInstance() : acceptGiftResultInfo_;
        }
      }
      /**
       * <code>.ActivityAcceptGiftResultInfo acceptGiftResultInfo = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo, ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo.Builder, ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfoOrBuilder> 
          getAcceptGiftResultInfoFieldBuilder() {
        if (acceptGiftResultInfoBuilder_ == null) {
          acceptGiftResultInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo, ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfo.Builder, ActivityAcceptGiftResultInfoOuterClass.ActivityAcceptGiftResultInfoOrBuilder>(
                  getAcceptGiftResultInfo(),
                  getParentForChildren(),
                  isClean());
          acceptGiftResultInfo_ = null;
        }
        return acceptGiftResultInfoBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
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


      // @@protoc_insertion_point(builder_scope:ActivityAcceptGiveGiftRsp)
    }

    // @@protoc_insertion_point(class_scope:ActivityAcceptGiveGiftRsp)
    private static final ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp();
    }

    public static ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityAcceptGiveGiftRsp>
        PARSER = new com.google.protobuf.AbstractParser<ActivityAcceptGiveGiftRsp>() {
      @java.lang.Override
      public ActivityAcceptGiveGiftRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityAcceptGiveGiftRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityAcceptGiveGiftRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityAcceptGiveGiftRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ActivityAcceptGiveGiftRspOuterClass.ActivityAcceptGiveGiftRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityAcceptGiveGiftRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityAcceptGiveGiftRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ActivityAcceptGiveGiftRsp.proto\032\"Activ" +
      "ityAcceptGiftResultInfo.proto\"\316\001\n\031Activi" +
      "tyAcceptGiveGiftRsp\022\022\n\nscheduleId\030\004 \001(\r\022" +
      ";\n\024acceptGiftResultInfo\030\t \001(\0132\035.Activity" +
      "AcceptGiftResultInfo\022\017\n\007retcode\030\006 \001(\005\"O\n" +
      "\013CKELMMOFJBG\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\253@" +
      "\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ActivityAcceptGiftResultInfoOuterClass.getDescriptor(),
        });
    internal_static_ActivityAcceptGiveGiftRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityAcceptGiveGiftRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityAcceptGiveGiftRsp_descriptor,
        new java.lang.String[] { "ScheduleId", "AcceptGiftResultInfo", "Retcode", });
    ActivityAcceptGiftResultInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
