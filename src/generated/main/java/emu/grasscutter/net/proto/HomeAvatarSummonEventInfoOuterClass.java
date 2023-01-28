// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAvatarSummonEventInfo.proto

public final class HomeAvatarSummonEventInfoOuterClass {
  private HomeAvatarSummonEventInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeAvatarSummonEventInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeAvatarSummonEventInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 suitId = 4;</code>
     * @return The suitId.
     */
    int getSuitId();

    /**
     * <code>uint32 randomPosition = 2;</code>
     * @return The randomPosition.
     */
    int getRandomPosition();

    /**
     * <code>uint32 eventId = 3;</code>
     * @return The eventId.
     */
    int getEventId();

    /**
     * <code>uint32 avatarId = 12;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>uint32 eventOverTime = 14;</code>
     * @return The eventOverTime.
     */
    int getEventOverTime();

    /**
     * <code>uint32 guid = 1;</code>
     * @return The guid.
     */
    int getGuid();
  }
  /**
   * Protobuf type {@code HomeAvatarSummonEventInfo}
   */
  public static final class HomeAvatarSummonEventInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeAvatarSummonEventInfo)
      HomeAvatarSummonEventInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeAvatarSummonEventInfo.newBuilder() to construct.
    private HomeAvatarSummonEventInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeAvatarSummonEventInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeAvatarSummonEventInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeAvatarSummonEventInfo(
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

              guid_ = input.readUInt32();
              break;
            }
            case 16: {

              randomPosition_ = input.readUInt32();
              break;
            }
            case 24: {

              eventId_ = input.readUInt32();
              break;
            }
            case 32: {

              suitId_ = input.readUInt32();
              break;
            }
            case 96: {

              avatarId_ = input.readUInt32();
              break;
            }
            case 112: {

              eventOverTime_ = input.readUInt32();
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
      return HomeAvatarSummonEventInfoOuterClass.internal_static_HomeAvatarSummonEventInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HomeAvatarSummonEventInfoOuterClass.internal_static_HomeAvatarSummonEventInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.class, HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.Builder.class);
    }

    public static final int SUITID_FIELD_NUMBER = 4;
    private int suitId_;
    /**
     * <code>uint32 suitId = 4;</code>
     * @return The suitId.
     */
    @java.lang.Override
    public int getSuitId() {
      return suitId_;
    }

    public static final int RANDOMPOSITION_FIELD_NUMBER = 2;
    private int randomPosition_;
    /**
     * <code>uint32 randomPosition = 2;</code>
     * @return The randomPosition.
     */
    @java.lang.Override
    public int getRandomPosition() {
      return randomPosition_;
    }

    public static final int EVENTID_FIELD_NUMBER = 3;
    private int eventId_;
    /**
     * <code>uint32 eventId = 3;</code>
     * @return The eventId.
     */
    @java.lang.Override
    public int getEventId() {
      return eventId_;
    }

    public static final int AVATARID_FIELD_NUMBER = 12;
    private int avatarId_;
    /**
     * <code>uint32 avatarId = 12;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int EVENTOVERTIME_FIELD_NUMBER = 14;
    private int eventOverTime_;
    /**
     * <code>uint32 eventOverTime = 14;</code>
     * @return The eventOverTime.
     */
    @java.lang.Override
    public int getEventOverTime() {
      return eventOverTime_;
    }

    public static final int GUID_FIELD_NUMBER = 1;
    private int guid_;
    /**
     * <code>uint32 guid = 1;</code>
     * @return The guid.
     */
    @java.lang.Override
    public int getGuid() {
      return guid_;
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
      if (guid_ != 0) {
        output.writeUInt32(1, guid_);
      }
      if (randomPosition_ != 0) {
        output.writeUInt32(2, randomPosition_);
      }
      if (eventId_ != 0) {
        output.writeUInt32(3, eventId_);
      }
      if (suitId_ != 0) {
        output.writeUInt32(4, suitId_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(12, avatarId_);
      }
      if (eventOverTime_ != 0) {
        output.writeUInt32(14, eventOverTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, guid_);
      }
      if (randomPosition_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, randomPosition_);
      }
      if (eventId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, eventId_);
      }
      if (suitId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, suitId_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, avatarId_);
      }
      if (eventOverTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, eventOverTime_);
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
      if (!(obj instanceof HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo)) {
        return super.equals(obj);
      }
      HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo other = (HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo) obj;

      if (getSuitId()
          != other.getSuitId()) return false;
      if (getRandomPosition()
          != other.getRandomPosition()) return false;
      if (getEventId()
          != other.getEventId()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getEventOverTime()
          != other.getEventOverTime()) return false;
      if (getGuid()
          != other.getGuid()) return false;
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
      hash = (37 * hash) + SUITID_FIELD_NUMBER;
      hash = (53 * hash) + getSuitId();
      hash = (37 * hash) + RANDOMPOSITION_FIELD_NUMBER;
      hash = (53 * hash) + getRandomPosition();
      hash = (37 * hash) + EVENTID_FIELD_NUMBER;
      hash = (53 * hash) + getEventId();
      hash = (37 * hash) + AVATARID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + EVENTOVERTIME_FIELD_NUMBER;
      hash = (53 * hash) + getEventOverTime();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo parseFrom(
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
    public static Builder newBuilder(HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo prototype) {
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
     * Protobuf type {@code HomeAvatarSummonEventInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeAvatarSummonEventInfo)
        HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HomeAvatarSummonEventInfoOuterClass.internal_static_HomeAvatarSummonEventInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HomeAvatarSummonEventInfoOuterClass.internal_static_HomeAvatarSummonEventInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.class, HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.Builder.class);
      }

      // Construct using HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.newBuilder()
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
        suitId_ = 0;

        randomPosition_ = 0;

        eventId_ = 0;

        avatarId_ = 0;

        eventOverTime_ = 0;

        guid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HomeAvatarSummonEventInfoOuterClass.internal_static_HomeAvatarSummonEventInfo_descriptor;
      }

      @java.lang.Override
      public HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo getDefaultInstanceForType() {
        return HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.getDefaultInstance();
      }

      @java.lang.Override
      public HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo build() {
        HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo buildPartial() {
        HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo result = new HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo(this);
        result.suitId_ = suitId_;
        result.randomPosition_ = randomPosition_;
        result.eventId_ = eventId_;
        result.avatarId_ = avatarId_;
        result.eventOverTime_ = eventOverTime_;
        result.guid_ = guid_;
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
        if (other instanceof HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo) {
          return mergeFrom((HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo other) {
        if (other == HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.getDefaultInstance()) return this;
        if (other.getSuitId() != 0) {
          setSuitId(other.getSuitId());
        }
        if (other.getRandomPosition() != 0) {
          setRandomPosition(other.getRandomPosition());
        }
        if (other.getEventId() != 0) {
          setEventId(other.getEventId());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getEventOverTime() != 0) {
          setEventOverTime(other.getEventOverTime());
        }
        if (other.getGuid() != 0) {
          setGuid(other.getGuid());
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
        HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int suitId_ ;
      /**
       * <code>uint32 suitId = 4;</code>
       * @return The suitId.
       */
      @java.lang.Override
      public int getSuitId() {
        return suitId_;
      }
      /**
       * <code>uint32 suitId = 4;</code>
       * @param value The suitId to set.
       * @return This builder for chaining.
       */
      public Builder setSuitId(int value) {
        
        suitId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 suitId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSuitId() {
        
        suitId_ = 0;
        onChanged();
        return this;
      }

      private int randomPosition_ ;
      /**
       * <code>uint32 randomPosition = 2;</code>
       * @return The randomPosition.
       */
      @java.lang.Override
      public int getRandomPosition() {
        return randomPosition_;
      }
      /**
       * <code>uint32 randomPosition = 2;</code>
       * @param value The randomPosition to set.
       * @return This builder for chaining.
       */
      public Builder setRandomPosition(int value) {
        
        randomPosition_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 randomPosition = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRandomPosition() {
        
        randomPosition_ = 0;
        onChanged();
        return this;
      }

      private int eventId_ ;
      /**
       * <code>uint32 eventId = 3;</code>
       * @return The eventId.
       */
      @java.lang.Override
      public int getEventId() {
        return eventId_;
      }
      /**
       * <code>uint32 eventId = 3;</code>
       * @param value The eventId to set.
       * @return This builder for chaining.
       */
      public Builder setEventId(int value) {
        
        eventId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 eventId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEventId() {
        
        eventId_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatarId = 12;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatarId = 12;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatarId = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int eventOverTime_ ;
      /**
       * <code>uint32 eventOverTime = 14;</code>
       * @return The eventOverTime.
       */
      @java.lang.Override
      public int getEventOverTime() {
        return eventOverTime_;
      }
      /**
       * <code>uint32 eventOverTime = 14;</code>
       * @param value The eventOverTime to set.
       * @return This builder for chaining.
       */
      public Builder setEventOverTime(int value) {
        
        eventOverTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 eventOverTime = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearEventOverTime() {
        
        eventOverTime_ = 0;
        onChanged();
        return this;
      }

      private int guid_ ;
      /**
       * <code>uint32 guid = 1;</code>
       * @return The guid.
       */
      @java.lang.Override
      public int getGuid() {
        return guid_;
      }
      /**
       * <code>uint32 guid = 1;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(int value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeAvatarSummonEventInfo)
    }

    // @@protoc_insertion_point(class_scope:HomeAvatarSummonEventInfo)
    private static final HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo();
    }

    public static HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeAvatarSummonEventInfo>
        PARSER = new com.google.protobuf.AbstractParser<HomeAvatarSummonEventInfo>() {
      @java.lang.Override
      public HomeAvatarSummonEventInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeAvatarSummonEventInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeAvatarSummonEventInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeAvatarSummonEventInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeAvatarSummonEventInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeAvatarSummonEventInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037HomeAvatarSummonEventInfo.proto\"\213\001\n\031Ho" +
      "meAvatarSummonEventInfo\022\016\n\006suitId\030\004 \001(\r\022" +
      "\026\n\016randomPosition\030\002 \001(\r\022\017\n\007eventId\030\003 \001(\r" +
      "\022\020\n\010avatarId\030\014 \001(\r\022\025\n\reventOverTime\030\016 \001(" +
      "\r\022\014\n\004guid\030\001 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeAvatarSummonEventInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeAvatarSummonEventInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeAvatarSummonEventInfo_descriptor,
        new java.lang.String[] { "SuitId", "RandomPosition", "EventId", "AvatarId", "EventOverTime", "Guid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
