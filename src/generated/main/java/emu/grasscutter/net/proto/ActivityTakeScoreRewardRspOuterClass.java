// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityTakeScoreRewardRsp.proto

public final class ActivityTakeScoreRewardRspOuterClass {
  private ActivityTakeScoreRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityTakeScoreRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityTakeScoreRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 rewardConfigId = 13;</code>
     * @return The rewardConfigId.
     */
    int getRewardConfigId();

    /**
     * <code>uint32 activityId = 14;</code>
     * @return The activityId.
     */
    int getActivityId();

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code ActivityTakeScoreRewardRsp}
   */
  public static final class ActivityTakeScoreRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityTakeScoreRewardRsp)
      ActivityTakeScoreRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityTakeScoreRewardRsp.newBuilder() to construct.
    private ActivityTakeScoreRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityTakeScoreRewardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityTakeScoreRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityTakeScoreRewardRsp(
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
            case 104: {

              rewardConfigId_ = input.readUInt32();
              break;
            }
            case 112: {

              activityId_ = input.readUInt32();
              break;
            }
            case 120: {

              retcode_ = input.readInt32();
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
      return ActivityTakeScoreRewardRspOuterClass.internal_static_ActivityTakeScoreRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ActivityTakeScoreRewardRspOuterClass.internal_static_ActivityTakeScoreRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp.class, ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code ActivityTakeScoreRewardRsp.EILFPJBGJHG}
     */
    public enum EILFPJBGJHG
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 8946;</code>
       */
      PEPPOHPHJOJ(1, 8946),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final EILFPJBGJHG DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 8946;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 8946;
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
      public static EILFPJBGJHG valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static EILFPJBGJHG forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 8946: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<EILFPJBGJHG>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          EILFPJBGJHG> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<EILFPJBGJHG>() {
              public EILFPJBGJHG findValueByNumber(int number) {
                return EILFPJBGJHG.forNumber(number);
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
        return ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final EILFPJBGJHG[] VALUES = getStaticValuesArray();
      private static EILFPJBGJHG[] getStaticValuesArray() {
        return new EILFPJBGJHG[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static EILFPJBGJHG valueOf(
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

      private EILFPJBGJHG(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ActivityTakeScoreRewardRsp.EILFPJBGJHG)
    }

    public static final int REWARDCONFIGID_FIELD_NUMBER = 13;
    private int rewardConfigId_;
    /**
     * <code>uint32 rewardConfigId = 13;</code>
     * @return The rewardConfigId.
     */
    @java.lang.Override
    public int getRewardConfigId() {
      return rewardConfigId_;
    }

    public static final int ACTIVITYID_FIELD_NUMBER = 14;
    private int activityId_;
    /**
     * <code>uint32 activityId = 14;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
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
      if (rewardConfigId_ != 0) {
        output.writeUInt32(13, rewardConfigId_);
      }
      if (activityId_ != 0) {
        output.writeUInt32(14, activityId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rewardConfigId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, rewardConfigId_);
      }
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, activityId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp)) {
        return super.equals(obj);
      }
      ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp other = (ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp) obj;

      if (getRewardConfigId()
          != other.getRewardConfigId()) return false;
      if (getActivityId()
          != other.getActivityId()) return false;
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
      hash = (37 * hash) + REWARDCONFIGID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardConfigId();
      hash = (37 * hash) + ACTIVITYID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp parseFrom(
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
    public static Builder newBuilder(ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp prototype) {
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
     * Protobuf type {@code ActivityTakeScoreRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityTakeScoreRewardRsp)
        ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ActivityTakeScoreRewardRspOuterClass.internal_static_ActivityTakeScoreRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ActivityTakeScoreRewardRspOuterClass.internal_static_ActivityTakeScoreRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp.class, ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp.Builder.class);
      }

      // Construct using ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp.newBuilder()
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
        rewardConfigId_ = 0;

        activityId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ActivityTakeScoreRewardRspOuterClass.internal_static_ActivityTakeScoreRewardRsp_descriptor;
      }

      @java.lang.Override
      public ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp getDefaultInstanceForType() {
        return ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp build() {
        ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp buildPartial() {
        ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp result = new ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp(this);
        result.rewardConfigId_ = rewardConfigId_;
        result.activityId_ = activityId_;
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
        if (other instanceof ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp) {
          return mergeFrom((ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp other) {
        if (other == ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp.getDefaultInstance()) return this;
        if (other.getRewardConfigId() != 0) {
          setRewardConfigId(other.getRewardConfigId());
        }
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
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
        ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int rewardConfigId_ ;
      /**
       * <code>uint32 rewardConfigId = 13;</code>
       * @return The rewardConfigId.
       */
      @java.lang.Override
      public int getRewardConfigId() {
        return rewardConfigId_;
      }
      /**
       * <code>uint32 rewardConfigId = 13;</code>
       * @param value The rewardConfigId to set.
       * @return This builder for chaining.
       */
      public Builder setRewardConfigId(int value) {
        
        rewardConfigId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rewardConfigId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardConfigId() {
        
        rewardConfigId_ = 0;
        onChanged();
        return this;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activityId = 14;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activityId = 14;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activityId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
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


      // @@protoc_insertion_point(builder_scope:ActivityTakeScoreRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:ActivityTakeScoreRewardRsp)
    private static final ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp();
    }

    public static ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityTakeScoreRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<ActivityTakeScoreRewardRsp>() {
      @java.lang.Override
      public ActivityTakeScoreRewardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityTakeScoreRewardRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityTakeScoreRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityTakeScoreRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ActivityTakeScoreRewardRspOuterClass.ActivityTakeScoreRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityTakeScoreRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityTakeScoreRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ActivityTakeScoreRewardRsp.proto\"\252\001\n\032A" +
      "ctivityTakeScoreRewardRsp\022\026\n\016rewardConfi" +
      "gId\030\r \001(\r\022\022\n\nactivityId\030\016 \001(\r\022\017\n\007retcode" +
      "\030\017 \001(\005\"O\n\013EILFPJBGJHG\022\010\n\004NONE\020\000\022\020\n\013PEPPO" +
      "HPHJOJ\020\362E\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOE" +
      "A\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityTakeScoreRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityTakeScoreRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityTakeScoreRewardRsp_descriptor,
        new java.lang.String[] { "RewardConfigId", "ActivityId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
