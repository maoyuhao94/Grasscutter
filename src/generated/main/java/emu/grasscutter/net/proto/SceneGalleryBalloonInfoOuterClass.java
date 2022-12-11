// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryBalloonInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryBalloonInfoOuterClass {
  private SceneGalleryBalloonInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryBalloonInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryBalloonInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
     */
    int getScenePlayerBalloonInfoMapCount();
    /**
     * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
     */
    boolean containsScenePlayerBalloonInfoMap(
        int key);
    /**
     * Use {@link #getScenePlayerBalloonInfoMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo>
    getScenePlayerBalloonInfoMap();
    /**
     * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo>
    getScenePlayerBalloonInfoMapMap();
    /**
     * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
     */

    emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo getScenePlayerBalloonInfoMapOrDefault(
        int key,
        emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo defaultValue);
    /**
     * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
     */

    emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo getScenePlayerBalloonInfoMapOrThrow(
        int key);

    /**
     * <code>uint32 end_time = 9;</code>
     * @return The endTime.
     */
    int getEndTime();
  }
  /**
   * Protobuf type {@code SceneGalleryBalloonInfo}
   */
  public static final class SceneGalleryBalloonInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryBalloonInfo)
      SceneGalleryBalloonInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryBalloonInfo.newBuilder() to construct.
    private SceneGalleryBalloonInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryBalloonInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryBalloonInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryBalloonInfo(
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
            case 72: {

              endTime_ = input.readUInt32();
              break;
            }
            case 106: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                scenePlayerBalloonInfoMap_ = com.google.protobuf.MapField.newMapField(
                    ScenePlayerBalloonInfoMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo>
              scenePlayerBalloonInfoMap__ = input.readMessage(
                  ScenePlayerBalloonInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              scenePlayerBalloonInfoMap_.getMutableMap().put(
                  scenePlayerBalloonInfoMap__.getKey(), scenePlayerBalloonInfoMap__.getValue());
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
      return emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.internal_static_SceneGalleryBalloonInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 13:
          return internalGetScenePlayerBalloonInfoMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.internal_static_SceneGalleryBalloonInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo.class, emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo.Builder.class);
    }

    public static final int SCENE_PLAYER_BALLOON_INFO_MAP_FIELD_NUMBER = 13;
    private static final class ScenePlayerBalloonInfoMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo>newDefaultInstance(
                  emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.internal_static_SceneGalleryBalloonInfo_ScenePlayerBalloonInfoMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo> scenePlayerBalloonInfoMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo>
    internalGetScenePlayerBalloonInfoMap() {
      if (scenePlayerBalloonInfoMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ScenePlayerBalloonInfoMapDefaultEntryHolder.defaultEntry);
      }
      return scenePlayerBalloonInfoMap_;
    }

    public int getScenePlayerBalloonInfoMapCount() {
      return internalGetScenePlayerBalloonInfoMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
     */

    @java.lang.Override
    public boolean containsScenePlayerBalloonInfoMap(
        int key) {
      
      return internalGetScenePlayerBalloonInfoMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getScenePlayerBalloonInfoMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo> getScenePlayerBalloonInfoMap() {
      return getScenePlayerBalloonInfoMapMap();
    }
    /**
     * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo> getScenePlayerBalloonInfoMapMap() {
      return internalGetScenePlayerBalloonInfoMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo getScenePlayerBalloonInfoMapOrDefault(
        int key,
        emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo> map =
          internalGetScenePlayerBalloonInfoMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo getScenePlayerBalloonInfoMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo> map =
          internalGetScenePlayerBalloonInfoMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int END_TIME_FIELD_NUMBER = 9;
    private int endTime_;
    /**
     * <code>uint32 end_time = 9;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
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
      if (endTime_ != 0) {
        output.writeUInt32(9, endTime_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetScenePlayerBalloonInfoMap(),
          ScenePlayerBalloonInfoMapDefaultEntryHolder.defaultEntry,
          13);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, endTime_);
      }
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo> entry
           : internalGetScenePlayerBalloonInfoMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo>
        scenePlayerBalloonInfoMap__ = ScenePlayerBalloonInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(13, scenePlayerBalloonInfoMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo other = (emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo) obj;

      if (!internalGetScenePlayerBalloonInfoMap().equals(
          other.internalGetScenePlayerBalloonInfoMap())) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
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
      if (!internalGetScenePlayerBalloonInfoMap().getMap().isEmpty()) {
        hash = (37 * hash) + SCENE_PLAYER_BALLOON_INFO_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetScenePlayerBalloonInfoMap().hashCode();
      }
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo prototype) {
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
     * Protobuf type {@code SceneGalleryBalloonInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryBalloonInfo)
        emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.internal_static_SceneGalleryBalloonInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 13:
            return internalGetScenePlayerBalloonInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 13:
            return internalGetMutableScenePlayerBalloonInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.internal_static_SceneGalleryBalloonInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo.class, emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo.newBuilder()
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
        internalGetMutableScenePlayerBalloonInfoMap().clear();
        endTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.internal_static_SceneGalleryBalloonInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo build() {
        emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo result = new emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo(this);
        int from_bitField0_ = bitField0_;
        result.scenePlayerBalloonInfoMap_ = internalGetScenePlayerBalloonInfoMap();
        result.scenePlayerBalloonInfoMap_.makeImmutable();
        result.endTime_ = endTime_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo.getDefaultInstance()) return this;
        internalGetMutableScenePlayerBalloonInfoMap().mergeFrom(
            other.internalGetScenePlayerBalloonInfoMap());
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
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
        emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo> scenePlayerBalloonInfoMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo>
      internalGetScenePlayerBalloonInfoMap() {
        if (scenePlayerBalloonInfoMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ScenePlayerBalloonInfoMapDefaultEntryHolder.defaultEntry);
        }
        return scenePlayerBalloonInfoMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo>
      internalGetMutableScenePlayerBalloonInfoMap() {
        onChanged();;
        if (scenePlayerBalloonInfoMap_ == null) {
          scenePlayerBalloonInfoMap_ = com.google.protobuf.MapField.newMapField(
              ScenePlayerBalloonInfoMapDefaultEntryHolder.defaultEntry);
        }
        if (!scenePlayerBalloonInfoMap_.isMutable()) {
          scenePlayerBalloonInfoMap_ = scenePlayerBalloonInfoMap_.copy();
        }
        return scenePlayerBalloonInfoMap_;
      }

      public int getScenePlayerBalloonInfoMapCount() {
        return internalGetScenePlayerBalloonInfoMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
       */

      @java.lang.Override
      public boolean containsScenePlayerBalloonInfoMap(
          int key) {
        
        return internalGetScenePlayerBalloonInfoMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getScenePlayerBalloonInfoMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo> getScenePlayerBalloonInfoMap() {
        return getScenePlayerBalloonInfoMapMap();
      }
      /**
       * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo> getScenePlayerBalloonInfoMapMap() {
        return internalGetScenePlayerBalloonInfoMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo getScenePlayerBalloonInfoMapOrDefault(
          int key,
          emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo> map =
            internalGetScenePlayerBalloonInfoMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo getScenePlayerBalloonInfoMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo> map =
            internalGetScenePlayerBalloonInfoMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearScenePlayerBalloonInfoMap() {
        internalGetMutableScenePlayerBalloonInfoMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
       */

      public Builder removeScenePlayerBalloonInfoMap(
          int key) {
        
        internalGetMutableScenePlayerBalloonInfoMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo>
      getMutableScenePlayerBalloonInfoMap() {
        return internalGetMutableScenePlayerBalloonInfoMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
       */
      public Builder putScenePlayerBalloonInfoMap(
          int key,
          emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableScenePlayerBalloonInfoMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .BalloonPlayerInfo&gt; scene_player_balloon_info_map = 13;</code>
       */

      public Builder putAllScenePlayerBalloonInfoMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo> values) {
        internalGetMutableScenePlayerBalloonInfoMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 9;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 9;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryBalloonInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryBalloonInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryBalloonInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryBalloonInfo>() {
      @java.lang.Override
      public SceneGalleryBalloonInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryBalloonInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryBalloonInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryBalloonInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryBalloonInfoOuterClass.SceneGalleryBalloonInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryBalloonInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryBalloonInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryBalloonInfo_ScenePlayerBalloonInfoMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryBalloonInfo_ScenePlayerBalloonInfoMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SceneGalleryBalloonInfo.proto\032\027Balloon" +
      "PlayerInfo.proto\"\341\001\n\027SceneGalleryBalloon" +
      "Info\022^\n\035scene_player_balloon_info_map\030\r " +
      "\003(\01327.SceneGalleryBalloonInfo.ScenePlaye" +
      "rBalloonInfoMapEntry\022\020\n\010end_time\030\t \001(\r\032T" +
      "\n\036ScenePlayerBalloonInfoMapEntry\022\013\n\003key\030" +
      "\001 \001(\r\022!\n\005value\030\002 \001(\0132\022.BalloonPlayerInfo" +
      ":\0028\001B\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneGalleryBalloonInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryBalloonInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryBalloonInfo_descriptor,
        new java.lang.String[] { "ScenePlayerBalloonInfoMap", "EndTime", });
    internal_static_SceneGalleryBalloonInfo_ScenePlayerBalloonInfoMapEntry_descriptor =
      internal_static_SceneGalleryBalloonInfo_descriptor.getNestedTypes().get(0);
    internal_static_SceneGalleryBalloonInfo_ScenePlayerBalloonInfoMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryBalloonInfo_ScenePlayerBalloonInfoMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
