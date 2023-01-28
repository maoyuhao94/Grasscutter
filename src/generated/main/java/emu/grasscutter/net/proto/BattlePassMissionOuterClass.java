// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BattlePassMission.proto

public final class BattlePassMissionOuterClass {
  private BattlePassMissionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BattlePassMissionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BattlePassMission)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 missionId = 6;</code>
     * @return The missionId.
     */
    int getMissionId();

    /**
     * <code>uint32 missionType = 14;</code>
     * @return The missionType.
     */
    int getMissionType();

    /**
     * <code>.MissionStatus missionStatus = 9;</code>
     * @return The enum numeric value on the wire for missionStatus.
     */
    int getMissionStatusValue();
    /**
     * <code>.MissionStatus missionStatus = 9;</code>
     * @return The missionStatus.
     */
    MissionStatusOuterClass.MissionStatus getMissionStatus();

    /**
     * <code>uint32 curProgress = 11;</code>
     * @return The curProgress.
     */
    int getCurProgress();

    /**
     * <code>uint32 rewardBattlePassPoint = 10;</code>
     * @return The rewardBattlePassPoint.
     */
    int getRewardBattlePassPoint();

    /**
     * <code>uint32 totalProgress = 13;</code>
     * @return The totalProgress.
     */
    int getTotalProgress();
  }
  /**
   * Protobuf type {@code BattlePassMission}
   */
  public static final class BattlePassMission extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BattlePassMission)
      BattlePassMissionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BattlePassMission.newBuilder() to construct.
    private BattlePassMission(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BattlePassMission() {
      missionStatus_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BattlePassMission();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BattlePassMission(
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
            case 48: {

              missionId_ = input.readUInt32();
              break;
            }
            case 72: {
              int rawValue = input.readEnum();

              missionStatus_ = rawValue;
              break;
            }
            case 80: {

              rewardBattlePassPoint_ = input.readUInt32();
              break;
            }
            case 88: {

              curProgress_ = input.readUInt32();
              break;
            }
            case 104: {

              totalProgress_ = input.readUInt32();
              break;
            }
            case 112: {

              missionType_ = input.readUInt32();
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
      return BattlePassMissionOuterClass.internal_static_BattlePassMission_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BattlePassMissionOuterClass.internal_static_BattlePassMission_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BattlePassMissionOuterClass.BattlePassMission.class, BattlePassMissionOuterClass.BattlePassMission.Builder.class);
    }

    public static final int MISSIONID_FIELD_NUMBER = 6;
    private int missionId_;
    /**
     * <code>uint32 missionId = 6;</code>
     * @return The missionId.
     */
    @java.lang.Override
    public int getMissionId() {
      return missionId_;
    }

    public static final int MISSIONTYPE_FIELD_NUMBER = 14;
    private int missionType_;
    /**
     * <code>uint32 missionType = 14;</code>
     * @return The missionType.
     */
    @java.lang.Override
    public int getMissionType() {
      return missionType_;
    }

    public static final int MISSIONSTATUS_FIELD_NUMBER = 9;
    private int missionStatus_;
    /**
     * <code>.MissionStatus missionStatus = 9;</code>
     * @return The enum numeric value on the wire for missionStatus.
     */
    @java.lang.Override public int getMissionStatusValue() {
      return missionStatus_;
    }
    /**
     * <code>.MissionStatus missionStatus = 9;</code>
     * @return The missionStatus.
     */
    @java.lang.Override public MissionStatusOuterClass.MissionStatus getMissionStatus() {
      @SuppressWarnings("deprecation")
      MissionStatusOuterClass.MissionStatus result = MissionStatusOuterClass.MissionStatus.valueOf(missionStatus_);
      return result == null ? MissionStatusOuterClass.MissionStatus.UNRECOGNIZED : result;
    }

    public static final int CURPROGRESS_FIELD_NUMBER = 11;
    private int curProgress_;
    /**
     * <code>uint32 curProgress = 11;</code>
     * @return The curProgress.
     */
    @java.lang.Override
    public int getCurProgress() {
      return curProgress_;
    }

    public static final int REWARDBATTLEPASSPOINT_FIELD_NUMBER = 10;
    private int rewardBattlePassPoint_;
    /**
     * <code>uint32 rewardBattlePassPoint = 10;</code>
     * @return The rewardBattlePassPoint.
     */
    @java.lang.Override
    public int getRewardBattlePassPoint() {
      return rewardBattlePassPoint_;
    }

    public static final int TOTALPROGRESS_FIELD_NUMBER = 13;
    private int totalProgress_;
    /**
     * <code>uint32 totalProgress = 13;</code>
     * @return The totalProgress.
     */
    @java.lang.Override
    public int getTotalProgress() {
      return totalProgress_;
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
      if (missionId_ != 0) {
        output.writeUInt32(6, missionId_);
      }
      if (missionStatus_ != MissionStatusOuterClass.MissionStatus.MISSION_STATUS_INVALID.getNumber()) {
        output.writeEnum(9, missionStatus_);
      }
      if (rewardBattlePassPoint_ != 0) {
        output.writeUInt32(10, rewardBattlePassPoint_);
      }
      if (curProgress_ != 0) {
        output.writeUInt32(11, curProgress_);
      }
      if (totalProgress_ != 0) {
        output.writeUInt32(13, totalProgress_);
      }
      if (missionType_ != 0) {
        output.writeUInt32(14, missionType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (missionId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, missionId_);
      }
      if (missionStatus_ != MissionStatusOuterClass.MissionStatus.MISSION_STATUS_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, missionStatus_);
      }
      if (rewardBattlePassPoint_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, rewardBattlePassPoint_);
      }
      if (curProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, curProgress_);
      }
      if (totalProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, totalProgress_);
      }
      if (missionType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, missionType_);
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
      if (!(obj instanceof BattlePassMissionOuterClass.BattlePassMission)) {
        return super.equals(obj);
      }
      BattlePassMissionOuterClass.BattlePassMission other = (BattlePassMissionOuterClass.BattlePassMission) obj;

      if (getMissionId()
          != other.getMissionId()) return false;
      if (getMissionType()
          != other.getMissionType()) return false;
      if (missionStatus_ != other.missionStatus_) return false;
      if (getCurProgress()
          != other.getCurProgress()) return false;
      if (getRewardBattlePassPoint()
          != other.getRewardBattlePassPoint()) return false;
      if (getTotalProgress()
          != other.getTotalProgress()) return false;
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
      hash = (37 * hash) + MISSIONID_FIELD_NUMBER;
      hash = (53 * hash) + getMissionId();
      hash = (37 * hash) + MISSIONTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getMissionType();
      hash = (37 * hash) + MISSIONSTATUS_FIELD_NUMBER;
      hash = (53 * hash) + missionStatus_;
      hash = (37 * hash) + CURPROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getCurProgress();
      hash = (37 * hash) + REWARDBATTLEPASSPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getRewardBattlePassPoint();
      hash = (37 * hash) + TOTALPROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getTotalProgress();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static BattlePassMissionOuterClass.BattlePassMission parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BattlePassMissionOuterClass.BattlePassMission parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BattlePassMissionOuterClass.BattlePassMission parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BattlePassMissionOuterClass.BattlePassMission parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BattlePassMissionOuterClass.BattlePassMission parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BattlePassMissionOuterClass.BattlePassMission parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BattlePassMissionOuterClass.BattlePassMission parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static BattlePassMissionOuterClass.BattlePassMission parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static BattlePassMissionOuterClass.BattlePassMission parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static BattlePassMissionOuterClass.BattlePassMission parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static BattlePassMissionOuterClass.BattlePassMission parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static BattlePassMissionOuterClass.BattlePassMission parseFrom(
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
    public static Builder newBuilder(BattlePassMissionOuterClass.BattlePassMission prototype) {
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
     * Protobuf type {@code BattlePassMission}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BattlePassMission)
        BattlePassMissionOuterClass.BattlePassMissionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return BattlePassMissionOuterClass.internal_static_BattlePassMission_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return BattlePassMissionOuterClass.internal_static_BattlePassMission_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                BattlePassMissionOuterClass.BattlePassMission.class, BattlePassMissionOuterClass.BattlePassMission.Builder.class);
      }

      // Construct using BattlePassMissionOuterClass.BattlePassMission.newBuilder()
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
        missionId_ = 0;

        missionType_ = 0;

        missionStatus_ = 0;

        curProgress_ = 0;

        rewardBattlePassPoint_ = 0;

        totalProgress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BattlePassMissionOuterClass.internal_static_BattlePassMission_descriptor;
      }

      @java.lang.Override
      public BattlePassMissionOuterClass.BattlePassMission getDefaultInstanceForType() {
        return BattlePassMissionOuterClass.BattlePassMission.getDefaultInstance();
      }

      @java.lang.Override
      public BattlePassMissionOuterClass.BattlePassMission build() {
        BattlePassMissionOuterClass.BattlePassMission result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public BattlePassMissionOuterClass.BattlePassMission buildPartial() {
        BattlePassMissionOuterClass.BattlePassMission result = new BattlePassMissionOuterClass.BattlePassMission(this);
        result.missionId_ = missionId_;
        result.missionType_ = missionType_;
        result.missionStatus_ = missionStatus_;
        result.curProgress_ = curProgress_;
        result.rewardBattlePassPoint_ = rewardBattlePassPoint_;
        result.totalProgress_ = totalProgress_;
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
        if (other instanceof BattlePassMissionOuterClass.BattlePassMission) {
          return mergeFrom((BattlePassMissionOuterClass.BattlePassMission)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(BattlePassMissionOuterClass.BattlePassMission other) {
        if (other == BattlePassMissionOuterClass.BattlePassMission.getDefaultInstance()) return this;
        if (other.getMissionId() != 0) {
          setMissionId(other.getMissionId());
        }
        if (other.getMissionType() != 0) {
          setMissionType(other.getMissionType());
        }
        if (other.missionStatus_ != 0) {
          setMissionStatusValue(other.getMissionStatusValue());
        }
        if (other.getCurProgress() != 0) {
          setCurProgress(other.getCurProgress());
        }
        if (other.getRewardBattlePassPoint() != 0) {
          setRewardBattlePassPoint(other.getRewardBattlePassPoint());
        }
        if (other.getTotalProgress() != 0) {
          setTotalProgress(other.getTotalProgress());
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
        BattlePassMissionOuterClass.BattlePassMission parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (BattlePassMissionOuterClass.BattlePassMission) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int missionId_ ;
      /**
       * <code>uint32 missionId = 6;</code>
       * @return The missionId.
       */
      @java.lang.Override
      public int getMissionId() {
        return missionId_;
      }
      /**
       * <code>uint32 missionId = 6;</code>
       * @param value The missionId to set.
       * @return This builder for chaining.
       */
      public Builder setMissionId(int value) {
        
        missionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 missionId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearMissionId() {
        
        missionId_ = 0;
        onChanged();
        return this;
      }

      private int missionType_ ;
      /**
       * <code>uint32 missionType = 14;</code>
       * @return The missionType.
       */
      @java.lang.Override
      public int getMissionType() {
        return missionType_;
      }
      /**
       * <code>uint32 missionType = 14;</code>
       * @param value The missionType to set.
       * @return This builder for chaining.
       */
      public Builder setMissionType(int value) {
        
        missionType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 missionType = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearMissionType() {
        
        missionType_ = 0;
        onChanged();
        return this;
      }

      private int missionStatus_ = 0;
      /**
       * <code>.MissionStatus missionStatus = 9;</code>
       * @return The enum numeric value on the wire for missionStatus.
       */
      @java.lang.Override public int getMissionStatusValue() {
        return missionStatus_;
      }
      /**
       * <code>.MissionStatus missionStatus = 9;</code>
       * @param value The enum numeric value on the wire for missionStatus to set.
       * @return This builder for chaining.
       */
      public Builder setMissionStatusValue(int value) {
        
        missionStatus_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MissionStatus missionStatus = 9;</code>
       * @return The missionStatus.
       */
      @java.lang.Override
      public MissionStatusOuterClass.MissionStatus getMissionStatus() {
        @SuppressWarnings("deprecation")
        MissionStatusOuterClass.MissionStatus result = MissionStatusOuterClass.MissionStatus.valueOf(missionStatus_);
        return result == null ? MissionStatusOuterClass.MissionStatus.UNRECOGNIZED : result;
      }
      /**
       * <code>.MissionStatus missionStatus = 9;</code>
       * @param value The missionStatus to set.
       * @return This builder for chaining.
       */
      public Builder setMissionStatus(MissionStatusOuterClass.MissionStatus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        missionStatus_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MissionStatus missionStatus = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMissionStatus() {
        
        missionStatus_ = 0;
        onChanged();
        return this;
      }

      private int curProgress_ ;
      /**
       * <code>uint32 curProgress = 11;</code>
       * @return The curProgress.
       */
      @java.lang.Override
      public int getCurProgress() {
        return curProgress_;
      }
      /**
       * <code>uint32 curProgress = 11;</code>
       * @param value The curProgress to set.
       * @return This builder for chaining.
       */
      public Builder setCurProgress(int value) {
        
        curProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 curProgress = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurProgress() {
        
        curProgress_ = 0;
        onChanged();
        return this;
      }

      private int rewardBattlePassPoint_ ;
      /**
       * <code>uint32 rewardBattlePassPoint = 10;</code>
       * @return The rewardBattlePassPoint.
       */
      @java.lang.Override
      public int getRewardBattlePassPoint() {
        return rewardBattlePassPoint_;
      }
      /**
       * <code>uint32 rewardBattlePassPoint = 10;</code>
       * @param value The rewardBattlePassPoint to set.
       * @return This builder for chaining.
       */
      public Builder setRewardBattlePassPoint(int value) {
        
        rewardBattlePassPoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rewardBattlePassPoint = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardBattlePassPoint() {
        
        rewardBattlePassPoint_ = 0;
        onChanged();
        return this;
      }

      private int totalProgress_ ;
      /**
       * <code>uint32 totalProgress = 13;</code>
       * @return The totalProgress.
       */
      @java.lang.Override
      public int getTotalProgress() {
        return totalProgress_;
      }
      /**
       * <code>uint32 totalProgress = 13;</code>
       * @param value The totalProgress to set.
       * @return This builder for chaining.
       */
      public Builder setTotalProgress(int value) {
        
        totalProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 totalProgress = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalProgress() {
        
        totalProgress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BattlePassMission)
    }

    // @@protoc_insertion_point(class_scope:BattlePassMission)
    private static final BattlePassMissionOuterClass.BattlePassMission DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new BattlePassMissionOuterClass.BattlePassMission();
    }

    public static BattlePassMissionOuterClass.BattlePassMission getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BattlePassMission>
        PARSER = new com.google.protobuf.AbstractParser<BattlePassMission>() {
      @java.lang.Override
      public BattlePassMission parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BattlePassMission(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BattlePassMission> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BattlePassMission> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public BattlePassMissionOuterClass.BattlePassMission getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BattlePassMission_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BattlePassMission_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BattlePassMission.proto\032\023MissionStatus" +
      ".proto\"\255\001\n\021BattlePassMission\022\021\n\tmissionI" +
      "d\030\006 \001(\r\022\023\n\013missionType\030\016 \001(\r\022%\n\rmissionS" +
      "tatus\030\t \001(\0162\016.MissionStatus\022\023\n\013curProgre" +
      "ss\030\013 \001(\r\022\035\n\025rewardBattlePassPoint\030\n \001(\r\022" +
      "\025\n\rtotalProgress\030\r \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          MissionStatusOuterClass.getDescriptor(),
        });
    internal_static_BattlePassMission_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BattlePassMission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BattlePassMission_descriptor,
        new java.lang.String[] { "MissionId", "MissionType", "MissionStatus", "CurProgress", "RewardBattlePassPoint", "TotalProgress", });
    MissionStatusOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
