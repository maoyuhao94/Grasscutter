// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonEntryPointInfo.proto

public final class DungeonEntryPointInfoOuterClass {
  private DungeonEntryPointInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonEntryPointInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonEntryPointInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 sceneId = 1;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>uint32 pointId = 15;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
     */
    java.util.List<DungeonEntryInfoOuterClass.DungeonEntryInfo> 
        getDungeonEntryListList();
    /**
     * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
     */
    DungeonEntryInfoOuterClass.DungeonEntryInfo getDungeonEntryList(int index);
    /**
     * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
     */
    int getDungeonEntryListCount();
    /**
     * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
     */
    java.util.List<? extends DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder> 
        getDungeonEntryListOrBuilderList();
    /**
     * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
     */
    DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder getDungeonEntryListOrBuilder(
        int index);

    /**
     * <code>uint32 recommendDungeonId = 7;</code>
     * @return The recommendDungeonId.
     */
    int getRecommendDungeonId();
  }
  /**
   * Protobuf type {@code DungeonEntryPointInfo}
   */
  public static final class DungeonEntryPointInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonEntryPointInfo)
      DungeonEntryPointInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonEntryPointInfo.newBuilder() to construct.
    private DungeonEntryPointInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonEntryPointInfo() {
      dungeonEntryList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonEntryPointInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonEntryPointInfo(
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
            case 8: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dungeonEntryList_ = new java.util.ArrayList<DungeonEntryInfoOuterClass.DungeonEntryInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              dungeonEntryList_.add(
                  input.readMessage(DungeonEntryInfoOuterClass.DungeonEntryInfo.parser(), extensionRegistry));
              break;
            }
            case 56: {

              recommendDungeonId_ = input.readUInt32();
              break;
            }
            case 120: {

              pointId_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          dungeonEntryList_ = java.util.Collections.unmodifiableList(dungeonEntryList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DungeonEntryPointInfoOuterClass.internal_static_DungeonEntryPointInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DungeonEntryPointInfoOuterClass.internal_static_DungeonEntryPointInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo.class, DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo.Builder.class);
    }

    public static final int SCENEID_FIELD_NUMBER = 1;
    private int sceneId_;
    /**
     * <code>uint32 sceneId = 1;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int POINTID_FIELD_NUMBER = 15;
    private int pointId_;
    /**
     * <code>uint32 pointId = 15;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int DUNGEONENTRYLIST_FIELD_NUMBER = 5;
    private java.util.List<DungeonEntryInfoOuterClass.DungeonEntryInfo> dungeonEntryList_;
    /**
     * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
     */
    @java.lang.Override
    public java.util.List<DungeonEntryInfoOuterClass.DungeonEntryInfo> getDungeonEntryListList() {
      return dungeonEntryList_;
    }
    /**
     * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder> 
        getDungeonEntryListOrBuilderList() {
      return dungeonEntryList_;
    }
    /**
     * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
     */
    @java.lang.Override
    public int getDungeonEntryListCount() {
      return dungeonEntryList_.size();
    }
    /**
     * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
     */
    @java.lang.Override
    public DungeonEntryInfoOuterClass.DungeonEntryInfo getDungeonEntryList(int index) {
      return dungeonEntryList_.get(index);
    }
    /**
     * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
     */
    @java.lang.Override
    public DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder getDungeonEntryListOrBuilder(
        int index) {
      return dungeonEntryList_.get(index);
    }

    public static final int RECOMMENDDUNGEONID_FIELD_NUMBER = 7;
    private int recommendDungeonId_;
    /**
     * <code>uint32 recommendDungeonId = 7;</code>
     * @return The recommendDungeonId.
     */
    @java.lang.Override
    public int getRecommendDungeonId() {
      return recommendDungeonId_;
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
      if (sceneId_ != 0) {
        output.writeUInt32(1, sceneId_);
      }
      for (int i = 0; i < dungeonEntryList_.size(); i++) {
        output.writeMessage(5, dungeonEntryList_.get(i));
      }
      if (recommendDungeonId_ != 0) {
        output.writeUInt32(7, recommendDungeonId_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(15, pointId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, sceneId_);
      }
      for (int i = 0; i < dungeonEntryList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, dungeonEntryList_.get(i));
      }
      if (recommendDungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, recommendDungeonId_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, pointId_);
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
      if (!(obj instanceof DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo)) {
        return super.equals(obj);
      }
      DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo other = (DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (getPointId()
          != other.getPointId()) return false;
      if (!getDungeonEntryListList()
          .equals(other.getDungeonEntryListList())) return false;
      if (getRecommendDungeonId()
          != other.getRecommendDungeonId()) return false;
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
      hash = (37 * hash) + SCENEID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + POINTID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      if (getDungeonEntryListCount() > 0) {
        hash = (37 * hash) + DUNGEONENTRYLIST_FIELD_NUMBER;
        hash = (53 * hash) + getDungeonEntryListList().hashCode();
      }
      hash = (37 * hash) + RECOMMENDDUNGEONID_FIELD_NUMBER;
      hash = (53 * hash) + getRecommendDungeonId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo parseFrom(
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
    public static Builder newBuilder(DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo prototype) {
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
     * Protobuf type {@code DungeonEntryPointInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonEntryPointInfo)
        DungeonEntryPointInfoOuterClass.DungeonEntryPointInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return DungeonEntryPointInfoOuterClass.internal_static_DungeonEntryPointInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return DungeonEntryPointInfoOuterClass.internal_static_DungeonEntryPointInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo.class, DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo.Builder.class);
      }

      // Construct using DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo.newBuilder()
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
          getDungeonEntryListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        sceneId_ = 0;

        pointId_ = 0;

        if (dungeonEntryListBuilder_ == null) {
          dungeonEntryList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          dungeonEntryListBuilder_.clear();
        }
        recommendDungeonId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DungeonEntryPointInfoOuterClass.internal_static_DungeonEntryPointInfo_descriptor;
      }

      @java.lang.Override
      public DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo getDefaultInstanceForType() {
        return DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo.getDefaultInstance();
      }

      @java.lang.Override
      public DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo build() {
        DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo buildPartial() {
        DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo result = new DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo(this);
        int from_bitField0_ = bitField0_;
        result.sceneId_ = sceneId_;
        result.pointId_ = pointId_;
        if (dungeonEntryListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            dungeonEntryList_ = java.util.Collections.unmodifiableList(dungeonEntryList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.dungeonEntryList_ = dungeonEntryList_;
        } else {
          result.dungeonEntryList_ = dungeonEntryListBuilder_.build();
        }
        result.recommendDungeonId_ = recommendDungeonId_;
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
        if (other instanceof DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo) {
          return mergeFrom((DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo other) {
        if (other == DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (dungeonEntryListBuilder_ == null) {
          if (!other.dungeonEntryList_.isEmpty()) {
            if (dungeonEntryList_.isEmpty()) {
              dungeonEntryList_ = other.dungeonEntryList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDungeonEntryListIsMutable();
              dungeonEntryList_.addAll(other.dungeonEntryList_);
            }
            onChanged();
          }
        } else {
          if (!other.dungeonEntryList_.isEmpty()) {
            if (dungeonEntryListBuilder_.isEmpty()) {
              dungeonEntryListBuilder_.dispose();
              dungeonEntryListBuilder_ = null;
              dungeonEntryList_ = other.dungeonEntryList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              dungeonEntryListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDungeonEntryListFieldBuilder() : null;
            } else {
              dungeonEntryListBuilder_.addAllMessages(other.dungeonEntryList_);
            }
          }
        }
        if (other.getRecommendDungeonId() != 0) {
          setRecommendDungeonId(other.getRecommendDungeonId());
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
        DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int sceneId_ ;
      /**
       * <code>uint32 sceneId = 1;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 sceneId = 1;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sceneId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 pointId = 15;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 pointId = 15;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pointId = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<DungeonEntryInfoOuterClass.DungeonEntryInfo> dungeonEntryList_ =
        java.util.Collections.emptyList();
      private void ensureDungeonEntryListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          dungeonEntryList_ = new java.util.ArrayList<DungeonEntryInfoOuterClass.DungeonEntryInfo>(dungeonEntryList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          DungeonEntryInfoOuterClass.DungeonEntryInfo, DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder, DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder> dungeonEntryListBuilder_;

      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public java.util.List<DungeonEntryInfoOuterClass.DungeonEntryInfo> getDungeonEntryListList() {
        if (dungeonEntryListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(dungeonEntryList_);
        } else {
          return dungeonEntryListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public int getDungeonEntryListCount() {
        if (dungeonEntryListBuilder_ == null) {
          return dungeonEntryList_.size();
        } else {
          return dungeonEntryListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public DungeonEntryInfoOuterClass.DungeonEntryInfo getDungeonEntryList(int index) {
        if (dungeonEntryListBuilder_ == null) {
          return dungeonEntryList_.get(index);
        } else {
          return dungeonEntryListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public Builder setDungeonEntryList(
          int index, DungeonEntryInfoOuterClass.DungeonEntryInfo value) {
        if (dungeonEntryListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDungeonEntryListIsMutable();
          dungeonEntryList_.set(index, value);
          onChanged();
        } else {
          dungeonEntryListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public Builder setDungeonEntryList(
          int index, DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder builderForValue) {
        if (dungeonEntryListBuilder_ == null) {
          ensureDungeonEntryListIsMutable();
          dungeonEntryList_.set(index, builderForValue.build());
          onChanged();
        } else {
          dungeonEntryListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public Builder addDungeonEntryList(DungeonEntryInfoOuterClass.DungeonEntryInfo value) {
        if (dungeonEntryListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDungeonEntryListIsMutable();
          dungeonEntryList_.add(value);
          onChanged();
        } else {
          dungeonEntryListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public Builder addDungeonEntryList(
          int index, DungeonEntryInfoOuterClass.DungeonEntryInfo value) {
        if (dungeonEntryListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDungeonEntryListIsMutable();
          dungeonEntryList_.add(index, value);
          onChanged();
        } else {
          dungeonEntryListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public Builder addDungeonEntryList(
          DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder builderForValue) {
        if (dungeonEntryListBuilder_ == null) {
          ensureDungeonEntryListIsMutable();
          dungeonEntryList_.add(builderForValue.build());
          onChanged();
        } else {
          dungeonEntryListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public Builder addDungeonEntryList(
          int index, DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder builderForValue) {
        if (dungeonEntryListBuilder_ == null) {
          ensureDungeonEntryListIsMutable();
          dungeonEntryList_.add(index, builderForValue.build());
          onChanged();
        } else {
          dungeonEntryListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public Builder addAllDungeonEntryList(
          java.lang.Iterable<? extends DungeonEntryInfoOuterClass.DungeonEntryInfo> values) {
        if (dungeonEntryListBuilder_ == null) {
          ensureDungeonEntryListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, dungeonEntryList_);
          onChanged();
        } else {
          dungeonEntryListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public Builder clearDungeonEntryList() {
        if (dungeonEntryListBuilder_ == null) {
          dungeonEntryList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          dungeonEntryListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public Builder removeDungeonEntryList(int index) {
        if (dungeonEntryListBuilder_ == null) {
          ensureDungeonEntryListIsMutable();
          dungeonEntryList_.remove(index);
          onChanged();
        } else {
          dungeonEntryListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder getDungeonEntryListBuilder(
          int index) {
        return getDungeonEntryListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder getDungeonEntryListOrBuilder(
          int index) {
        if (dungeonEntryListBuilder_ == null) {
          return dungeonEntryList_.get(index);  } else {
          return dungeonEntryListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public java.util.List<? extends DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder> 
           getDungeonEntryListOrBuilderList() {
        if (dungeonEntryListBuilder_ != null) {
          return dungeonEntryListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(dungeonEntryList_);
        }
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder addDungeonEntryListBuilder() {
        return getDungeonEntryListFieldBuilder().addBuilder(
            DungeonEntryInfoOuterClass.DungeonEntryInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder addDungeonEntryListBuilder(
          int index) {
        return getDungeonEntryListFieldBuilder().addBuilder(
            index, DungeonEntryInfoOuterClass.DungeonEntryInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .DungeonEntryInfo dungeonEntryList = 5;</code>
       */
      public java.util.List<DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder> 
           getDungeonEntryListBuilderList() {
        return getDungeonEntryListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          DungeonEntryInfoOuterClass.DungeonEntryInfo, DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder, DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder> 
          getDungeonEntryListFieldBuilder() {
        if (dungeonEntryListBuilder_ == null) {
          dungeonEntryListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              DungeonEntryInfoOuterClass.DungeonEntryInfo, DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder, DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder>(
                  dungeonEntryList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          dungeonEntryList_ = null;
        }
        return dungeonEntryListBuilder_;
      }

      private int recommendDungeonId_ ;
      /**
       * <code>uint32 recommendDungeonId = 7;</code>
       * @return The recommendDungeonId.
       */
      @java.lang.Override
      public int getRecommendDungeonId() {
        return recommendDungeonId_;
      }
      /**
       * <code>uint32 recommendDungeonId = 7;</code>
       * @param value The recommendDungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setRecommendDungeonId(int value) {
        
        recommendDungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 recommendDungeonId = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRecommendDungeonId() {
        
        recommendDungeonId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonEntryPointInfo)
    }

    // @@protoc_insertion_point(class_scope:DungeonEntryPointInfo)
    private static final DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo();
    }

    public static DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonEntryPointInfo>
        PARSER = new com.google.protobuf.AbstractParser<DungeonEntryPointInfo>() {
      @java.lang.Override
      public DungeonEntryPointInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonEntryPointInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonEntryPointInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonEntryPointInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public DungeonEntryPointInfoOuterClass.DungeonEntryPointInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonEntryPointInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonEntryPointInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033DungeonEntryPointInfo.proto\032\026DungeonEn" +
      "tryInfo.proto\"\202\001\n\025DungeonEntryPointInfo\022" +
      "\017\n\007sceneId\030\001 \001(\r\022\017\n\007pointId\030\017 \001(\r\022+\n\020dun" +
      "geonEntryList\030\005 \003(\0132\021.DungeonEntryInfo\022\032" +
      "\n\022recommendDungeonId\030\007 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          DungeonEntryInfoOuterClass.getDescriptor(),
        });
    internal_static_DungeonEntryPointInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonEntryPointInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonEntryPointInfo_descriptor,
        new java.lang.String[] { "SceneId", "PointId", "DungeonEntryList", "RecommendDungeonId", });
    DungeonEntryInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
