// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FallPlayerInfo.proto

public final class FallPlayerInfoOuterClass {
  private FallPlayerInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FallPlayerInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FallPlayerInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 timeCost = 10;</code>
     * @return The timeCost.
     */
    int getTimeCost();

    /**
     * <code>uint32 uid = 4;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
     */
    int getBallCatchCountMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
     */
    boolean containsBallCatchCountMap(
        int key);
    /**
     * Use {@link #getBallCatchCountMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getBallCatchCountMap();
    /**
     * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getBallCatchCountMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
     */

    int getBallCatchCountMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
     */

    int getBallCatchCountMapOrThrow(
        int key);

    /**
     * <code>uint32 curScore = 11;</code>
     * @return The curScore.
     */
    int getCurScore();

    /**
     * <code>bool isGround = 15;</code>
     * @return The isGround.
     */
    boolean getIsGround();
  }
  /**
   * Protobuf type {@code FallPlayerInfo}
   */
  public static final class FallPlayerInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FallPlayerInfo)
      FallPlayerInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FallPlayerInfo.newBuilder() to construct.
    private FallPlayerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FallPlayerInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FallPlayerInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FallPlayerInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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

              uid_ = input.readUInt32();
              break;
            }
            case 66: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                ballCatchCountMap_ = com.google.protobuf.MapField.newMapField(
                    BallCatchCountMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              ballCatchCountMap__ = input.readMessage(
                  BallCatchCountMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              ballCatchCountMap_.getMutableMap().put(
                  ballCatchCountMap__.getKey(), ballCatchCountMap__.getValue());
              break;
            }
            case 80: {

              timeCost_ = input.readUInt32();
              break;
            }
            case 88: {

              curScore_ = input.readUInt32();
              break;
            }
            case 120: {

              isGround_ = input.readBool();
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
      return FallPlayerInfoOuterClass.internal_static_FallPlayerInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 8:
          return internalGetBallCatchCountMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return FallPlayerInfoOuterClass.internal_static_FallPlayerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FallPlayerInfoOuterClass.FallPlayerInfo.class, FallPlayerInfoOuterClass.FallPlayerInfo.Builder.class);
    }

    public static final int TIMECOST_FIELD_NUMBER = 10;
    private int timeCost_;
    /**
     * <code>uint32 timeCost = 10;</code>
     * @return The timeCost.
     */
    @java.lang.Override
    public int getTimeCost() {
      return timeCost_;
    }

    public static final int UID_FIELD_NUMBER = 4;
    private int uid_;
    /**
     * <code>uint32 uid = 4;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int BALLCATCHCOUNTMAP_FIELD_NUMBER = 8;
    private static final class BallCatchCountMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  FallPlayerInfoOuterClass.internal_static_FallPlayerInfo_BallCatchCountMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> ballCatchCountMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetBallCatchCountMap() {
      if (ballCatchCountMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            BallCatchCountMapDefaultEntryHolder.defaultEntry);
      }
      return ballCatchCountMap_;
    }

    public int getBallCatchCountMapCount() {
      return internalGetBallCatchCountMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
     */

    @java.lang.Override
    public boolean containsBallCatchCountMap(
        int key) {
      
      return internalGetBallCatchCountMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getBallCatchCountMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getBallCatchCountMap() {
      return getBallCatchCountMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getBallCatchCountMapMap() {
      return internalGetBallCatchCountMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
     */
    @java.lang.Override

    public int getBallCatchCountMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetBallCatchCountMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
     */
    @java.lang.Override

    public int getBallCatchCountMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetBallCatchCountMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int CURSCORE_FIELD_NUMBER = 11;
    private int curScore_;
    /**
     * <code>uint32 curScore = 11;</code>
     * @return The curScore.
     */
    @java.lang.Override
    public int getCurScore() {
      return curScore_;
    }

    public static final int ISGROUND_FIELD_NUMBER = 15;
    private boolean isGround_;
    /**
     * <code>bool isGround = 15;</code>
     * @return The isGround.
     */
    @java.lang.Override
    public boolean getIsGround() {
      return isGround_;
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
      if (uid_ != 0) {
        output.writeUInt32(4, uid_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetBallCatchCountMap(),
          BallCatchCountMapDefaultEntryHolder.defaultEntry,
          8);
      if (timeCost_ != 0) {
        output.writeUInt32(10, timeCost_);
      }
      if (curScore_ != 0) {
        output.writeUInt32(11, curScore_);
      }
      if (isGround_ != false) {
        output.writeBool(15, isGround_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, uid_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetBallCatchCountMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        ballCatchCountMap__ = BallCatchCountMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(8, ballCatchCountMap__);
      }
      if (timeCost_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, timeCost_);
      }
      if (curScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, curScore_);
      }
      if (isGround_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isGround_);
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
      if (!(obj instanceof FallPlayerInfoOuterClass.FallPlayerInfo)) {
        return super.equals(obj);
      }
      FallPlayerInfoOuterClass.FallPlayerInfo other = (FallPlayerInfoOuterClass.FallPlayerInfo) obj;

      if (getTimeCost()
          != other.getTimeCost()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (!internalGetBallCatchCountMap().equals(
          other.internalGetBallCatchCountMap())) return false;
      if (getCurScore()
          != other.getCurScore()) return false;
      if (getIsGround()
          != other.getIsGround()) return false;
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
      hash = (37 * hash) + TIMECOST_FIELD_NUMBER;
      hash = (53 * hash) + getTimeCost();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      if (!internalGetBallCatchCountMap().getMap().isEmpty()) {
        hash = (37 * hash) + BALLCATCHCOUNTMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetBallCatchCountMap().hashCode();
      }
      hash = (37 * hash) + CURSCORE_FIELD_NUMBER;
      hash = (53 * hash) + getCurScore();
      hash = (37 * hash) + ISGROUND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsGround());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static FallPlayerInfoOuterClass.FallPlayerInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FallPlayerInfoOuterClass.FallPlayerInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FallPlayerInfoOuterClass.FallPlayerInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FallPlayerInfoOuterClass.FallPlayerInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FallPlayerInfoOuterClass.FallPlayerInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FallPlayerInfoOuterClass.FallPlayerInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FallPlayerInfoOuterClass.FallPlayerInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static FallPlayerInfoOuterClass.FallPlayerInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static FallPlayerInfoOuterClass.FallPlayerInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static FallPlayerInfoOuterClass.FallPlayerInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static FallPlayerInfoOuterClass.FallPlayerInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static FallPlayerInfoOuterClass.FallPlayerInfo parseFrom(
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
    public static Builder newBuilder(FallPlayerInfoOuterClass.FallPlayerInfo prototype) {
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
     * Protobuf type {@code FallPlayerInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FallPlayerInfo)
        FallPlayerInfoOuterClass.FallPlayerInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return FallPlayerInfoOuterClass.internal_static_FallPlayerInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetBallCatchCountMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetMutableBallCatchCountMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return FallPlayerInfoOuterClass.internal_static_FallPlayerInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                FallPlayerInfoOuterClass.FallPlayerInfo.class, FallPlayerInfoOuterClass.FallPlayerInfo.Builder.class);
      }

      // Construct using FallPlayerInfoOuterClass.FallPlayerInfo.newBuilder()
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
        timeCost_ = 0;

        uid_ = 0;

        internalGetMutableBallCatchCountMap().clear();
        curScore_ = 0;

        isGround_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return FallPlayerInfoOuterClass.internal_static_FallPlayerInfo_descriptor;
      }

      @java.lang.Override
      public FallPlayerInfoOuterClass.FallPlayerInfo getDefaultInstanceForType() {
        return FallPlayerInfoOuterClass.FallPlayerInfo.getDefaultInstance();
      }

      @java.lang.Override
      public FallPlayerInfoOuterClass.FallPlayerInfo build() {
        FallPlayerInfoOuterClass.FallPlayerInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public FallPlayerInfoOuterClass.FallPlayerInfo buildPartial() {
        FallPlayerInfoOuterClass.FallPlayerInfo result = new FallPlayerInfoOuterClass.FallPlayerInfo(this);
        int from_bitField0_ = bitField0_;
        result.timeCost_ = timeCost_;
        result.uid_ = uid_;
        result.ballCatchCountMap_ = internalGetBallCatchCountMap();
        result.ballCatchCountMap_.makeImmutable();
        result.curScore_ = curScore_;
        result.isGround_ = isGround_;
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
        if (other instanceof FallPlayerInfoOuterClass.FallPlayerInfo) {
          return mergeFrom((FallPlayerInfoOuterClass.FallPlayerInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(FallPlayerInfoOuterClass.FallPlayerInfo other) {
        if (other == FallPlayerInfoOuterClass.FallPlayerInfo.getDefaultInstance()) return this;
        if (other.getTimeCost() != 0) {
          setTimeCost(other.getTimeCost());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        internalGetMutableBallCatchCountMap().mergeFrom(
            other.internalGetBallCatchCountMap());
        if (other.getCurScore() != 0) {
          setCurScore(other.getCurScore());
        }
        if (other.getIsGround() != false) {
          setIsGround(other.getIsGround());
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
        FallPlayerInfoOuterClass.FallPlayerInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (FallPlayerInfoOuterClass.FallPlayerInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int timeCost_ ;
      /**
       * <code>uint32 timeCost = 10;</code>
       * @return The timeCost.
       */
      @java.lang.Override
      public int getTimeCost() {
        return timeCost_;
      }
      /**
       * <code>uint32 timeCost = 10;</code>
       * @param value The timeCost to set.
       * @return This builder for chaining.
       */
      public Builder setTimeCost(int value) {
        
        timeCost_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 timeCost = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimeCost() {
        
        timeCost_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 4;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 4;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> ballCatchCountMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetBallCatchCountMap() {
        if (ballCatchCountMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              BallCatchCountMapDefaultEntryHolder.defaultEntry);
        }
        return ballCatchCountMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableBallCatchCountMap() {
        onChanged();;
        if (ballCatchCountMap_ == null) {
          ballCatchCountMap_ = com.google.protobuf.MapField.newMapField(
              BallCatchCountMapDefaultEntryHolder.defaultEntry);
        }
        if (!ballCatchCountMap_.isMutable()) {
          ballCatchCountMap_ = ballCatchCountMap_.copy();
        }
        return ballCatchCountMap_;
      }

      public int getBallCatchCountMapCount() {
        return internalGetBallCatchCountMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
       */

      @java.lang.Override
      public boolean containsBallCatchCountMap(
          int key) {
        
        return internalGetBallCatchCountMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getBallCatchCountMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getBallCatchCountMap() {
        return getBallCatchCountMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getBallCatchCountMapMap() {
        return internalGetBallCatchCountMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
       */
      @java.lang.Override

      public int getBallCatchCountMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetBallCatchCountMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
       */
      @java.lang.Override

      public int getBallCatchCountMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetBallCatchCountMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearBallCatchCountMap() {
        internalGetMutableBallCatchCountMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
       */

      public Builder removeBallCatchCountMap(
          int key) {
        
        internalGetMutableBallCatchCountMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableBallCatchCountMap() {
        return internalGetMutableBallCatchCountMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
       */
      public Builder putBallCatchCountMap(
          int key,
          int value) {
        
        
        internalGetMutableBallCatchCountMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ballCatchCountMap = 8;</code>
       */

      public Builder putAllBallCatchCountMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableBallCatchCountMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int curScore_ ;
      /**
       * <code>uint32 curScore = 11;</code>
       * @return The curScore.
       */
      @java.lang.Override
      public int getCurScore() {
        return curScore_;
      }
      /**
       * <code>uint32 curScore = 11;</code>
       * @param value The curScore to set.
       * @return This builder for chaining.
       */
      public Builder setCurScore(int value) {
        
        curScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 curScore = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurScore() {
        
        curScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isGround_ ;
      /**
       * <code>bool isGround = 15;</code>
       * @return The isGround.
       */
      @java.lang.Override
      public boolean getIsGround() {
        return isGround_;
      }
      /**
       * <code>bool isGround = 15;</code>
       * @param value The isGround to set.
       * @return This builder for chaining.
       */
      public Builder setIsGround(boolean value) {
        
        isGround_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isGround = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsGround() {
        
        isGround_ = false;
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


      // @@protoc_insertion_point(builder_scope:FallPlayerInfo)
    }

    // @@protoc_insertion_point(class_scope:FallPlayerInfo)
    private static final FallPlayerInfoOuterClass.FallPlayerInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new FallPlayerInfoOuterClass.FallPlayerInfo();
    }

    public static FallPlayerInfoOuterClass.FallPlayerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FallPlayerInfo>
        PARSER = new com.google.protobuf.AbstractParser<FallPlayerInfo>() {
      @java.lang.Override
      public FallPlayerInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FallPlayerInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FallPlayerInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FallPlayerInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public FallPlayerInfoOuterClass.FallPlayerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FallPlayerInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FallPlayerInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FallPlayerInfo_BallCatchCountMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FallPlayerInfo_BallCatchCountMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024FallPlayerInfo.proto\"\320\001\n\016FallPlayerInf" +
      "o\022\020\n\010timeCost\030\n \001(\r\022\013\n\003uid\030\004 \001(\r\022A\n\021ball" +
      "CatchCountMap\030\010 \003(\0132&.FallPlayerInfo.Bal" +
      "lCatchCountMapEntry\022\020\n\010curScore\030\013 \001(\r\022\020\n" +
      "\010isGround\030\017 \001(\010\0328\n\026BallCatchCountMapEntr" +
      "y\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FallPlayerInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FallPlayerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FallPlayerInfo_descriptor,
        new java.lang.String[] { "TimeCost", "Uid", "BallCatchCountMap", "CurScore", "IsGround", });
    internal_static_FallPlayerInfo_BallCatchCountMapEntry_descriptor =
      internal_static_FallPlayerInfo_descriptor.getNestedTypes().get(0);
    internal_static_FallPlayerInfo_BallCatchCountMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FallPlayerInfo_BallCatchCountMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
