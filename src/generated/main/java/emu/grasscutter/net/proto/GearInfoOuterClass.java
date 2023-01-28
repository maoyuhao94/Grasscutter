// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GearInfo.proto

public final class GearInfoOuterClass {
  private GearInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GearInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GearInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
     */
    java.util.List<GearLevelDataOuterClass.GearLevelData> 
        getGearLevelDataListList();
    /**
     * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
     */
    GearLevelDataOuterClass.GearLevelData getGearLevelDataList(int index);
    /**
     * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
     */
    int getGearLevelDataListCount();
    /**
     * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
     */
    java.util.List<? extends GearLevelDataOuterClass.GearLevelDataOrBuilder> 
        getGearLevelDataListOrBuilderList();
    /**
     * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
     */
    GearLevelDataOuterClass.GearLevelDataOrBuilder getGearLevelDataListOrBuilder(
        int index);

    /**
     * <code>.JigsawPictureData jigsawPictureData = 13;</code>
     * @return Whether the jigsawPictureData field is set.
     */
    boolean hasJigsawPictureData();
    /**
     * <code>.JigsawPictureData jigsawPictureData = 13;</code>
     * @return The jigsawPictureData.
     */
    JigsawPictureDataOuterClass.JigsawPictureData getJigsawPictureData();
    /**
     * <code>.JigsawPictureData jigsawPictureData = 13;</code>
     */
    JigsawPictureDataOuterClass.JigsawPictureDataOrBuilder getJigsawPictureDataOrBuilder();
  }
  /**
   * Protobuf type {@code GearInfo}
   */
  public static final class GearInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GearInfo)
      GearInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GearInfo.newBuilder() to construct.
    private GearInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GearInfo() {
      gearLevelDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GearInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GearInfo(
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
            case 74: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                gearLevelDataList_ = new java.util.ArrayList<GearLevelDataOuterClass.GearLevelData>();
                mutable_bitField0_ |= 0x00000001;
              }
              gearLevelDataList_.add(
                  input.readMessage(GearLevelDataOuterClass.GearLevelData.parser(), extensionRegistry));
              break;
            }
            case 106: {
              JigsawPictureDataOuterClass.JigsawPictureData.Builder subBuilder = null;
              if (jigsawPictureData_ != null) {
                subBuilder = jigsawPictureData_.toBuilder();
              }
              jigsawPictureData_ = input.readMessage(JigsawPictureDataOuterClass.JigsawPictureData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(jigsawPictureData_);
                jigsawPictureData_ = subBuilder.buildPartial();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          gearLevelDataList_ = java.util.Collections.unmodifiableList(gearLevelDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GearInfoOuterClass.internal_static_GearInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GearInfoOuterClass.internal_static_GearInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GearInfoOuterClass.GearInfo.class, GearInfoOuterClass.GearInfo.Builder.class);
    }

    public static final int GEARLEVELDATALIST_FIELD_NUMBER = 9;
    private java.util.List<GearLevelDataOuterClass.GearLevelData> gearLevelDataList_;
    /**
     * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
     */
    @java.lang.Override
    public java.util.List<GearLevelDataOuterClass.GearLevelData> getGearLevelDataListList() {
      return gearLevelDataList_;
    }
    /**
     * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends GearLevelDataOuterClass.GearLevelDataOrBuilder> 
        getGearLevelDataListOrBuilderList() {
      return gearLevelDataList_;
    }
    /**
     * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
     */
    @java.lang.Override
    public int getGearLevelDataListCount() {
      return gearLevelDataList_.size();
    }
    /**
     * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
     */
    @java.lang.Override
    public GearLevelDataOuterClass.GearLevelData getGearLevelDataList(int index) {
      return gearLevelDataList_.get(index);
    }
    /**
     * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
     */
    @java.lang.Override
    public GearLevelDataOuterClass.GearLevelDataOrBuilder getGearLevelDataListOrBuilder(
        int index) {
      return gearLevelDataList_.get(index);
    }

    public static final int JIGSAWPICTUREDATA_FIELD_NUMBER = 13;
    private JigsawPictureDataOuterClass.JigsawPictureData jigsawPictureData_;
    /**
     * <code>.JigsawPictureData jigsawPictureData = 13;</code>
     * @return Whether the jigsawPictureData field is set.
     */
    @java.lang.Override
    public boolean hasJigsawPictureData() {
      return jigsawPictureData_ != null;
    }
    /**
     * <code>.JigsawPictureData jigsawPictureData = 13;</code>
     * @return The jigsawPictureData.
     */
    @java.lang.Override
    public JigsawPictureDataOuterClass.JigsawPictureData getJigsawPictureData() {
      return jigsawPictureData_ == null ? JigsawPictureDataOuterClass.JigsawPictureData.getDefaultInstance() : jigsawPictureData_;
    }
    /**
     * <code>.JigsawPictureData jigsawPictureData = 13;</code>
     */
    @java.lang.Override
    public JigsawPictureDataOuterClass.JigsawPictureDataOrBuilder getJigsawPictureDataOrBuilder() {
      return getJigsawPictureData();
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
      for (int i = 0; i < gearLevelDataList_.size(); i++) {
        output.writeMessage(9, gearLevelDataList_.get(i));
      }
      if (jigsawPictureData_ != null) {
        output.writeMessage(13, getJigsawPictureData());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < gearLevelDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, gearLevelDataList_.get(i));
      }
      if (jigsawPictureData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getJigsawPictureData());
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
      if (!(obj instanceof GearInfoOuterClass.GearInfo)) {
        return super.equals(obj);
      }
      GearInfoOuterClass.GearInfo other = (GearInfoOuterClass.GearInfo) obj;

      if (!getGearLevelDataListList()
          .equals(other.getGearLevelDataListList())) return false;
      if (hasJigsawPictureData() != other.hasJigsawPictureData()) return false;
      if (hasJigsawPictureData()) {
        if (!getJigsawPictureData()
            .equals(other.getJigsawPictureData())) return false;
      }
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
      if (getGearLevelDataListCount() > 0) {
        hash = (37 * hash) + GEARLEVELDATALIST_FIELD_NUMBER;
        hash = (53 * hash) + getGearLevelDataListList().hashCode();
      }
      if (hasJigsawPictureData()) {
        hash = (37 * hash) + JIGSAWPICTUREDATA_FIELD_NUMBER;
        hash = (53 * hash) + getJigsawPictureData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GearInfoOuterClass.GearInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GearInfoOuterClass.GearInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GearInfoOuterClass.GearInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GearInfoOuterClass.GearInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GearInfoOuterClass.GearInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GearInfoOuterClass.GearInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GearInfoOuterClass.GearInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GearInfoOuterClass.GearInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GearInfoOuterClass.GearInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GearInfoOuterClass.GearInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GearInfoOuterClass.GearInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GearInfoOuterClass.GearInfo parseFrom(
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
    public static Builder newBuilder(GearInfoOuterClass.GearInfo prototype) {
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
     * Protobuf type {@code GearInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GearInfo)
        GearInfoOuterClass.GearInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GearInfoOuterClass.internal_static_GearInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GearInfoOuterClass.internal_static_GearInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GearInfoOuterClass.GearInfo.class, GearInfoOuterClass.GearInfo.Builder.class);
      }

      // Construct using GearInfoOuterClass.GearInfo.newBuilder()
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
          getGearLevelDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (gearLevelDataListBuilder_ == null) {
          gearLevelDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          gearLevelDataListBuilder_.clear();
        }
        if (jigsawPictureDataBuilder_ == null) {
          jigsawPictureData_ = null;
        } else {
          jigsawPictureData_ = null;
          jigsawPictureDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GearInfoOuterClass.internal_static_GearInfo_descriptor;
      }

      @java.lang.Override
      public GearInfoOuterClass.GearInfo getDefaultInstanceForType() {
        return GearInfoOuterClass.GearInfo.getDefaultInstance();
      }

      @java.lang.Override
      public GearInfoOuterClass.GearInfo build() {
        GearInfoOuterClass.GearInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GearInfoOuterClass.GearInfo buildPartial() {
        GearInfoOuterClass.GearInfo result = new GearInfoOuterClass.GearInfo(this);
        int from_bitField0_ = bitField0_;
        if (gearLevelDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            gearLevelDataList_ = java.util.Collections.unmodifiableList(gearLevelDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.gearLevelDataList_ = gearLevelDataList_;
        } else {
          result.gearLevelDataList_ = gearLevelDataListBuilder_.build();
        }
        if (jigsawPictureDataBuilder_ == null) {
          result.jigsawPictureData_ = jigsawPictureData_;
        } else {
          result.jigsawPictureData_ = jigsawPictureDataBuilder_.build();
        }
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
        if (other instanceof GearInfoOuterClass.GearInfo) {
          return mergeFrom((GearInfoOuterClass.GearInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GearInfoOuterClass.GearInfo other) {
        if (other == GearInfoOuterClass.GearInfo.getDefaultInstance()) return this;
        if (gearLevelDataListBuilder_ == null) {
          if (!other.gearLevelDataList_.isEmpty()) {
            if (gearLevelDataList_.isEmpty()) {
              gearLevelDataList_ = other.gearLevelDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureGearLevelDataListIsMutable();
              gearLevelDataList_.addAll(other.gearLevelDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.gearLevelDataList_.isEmpty()) {
            if (gearLevelDataListBuilder_.isEmpty()) {
              gearLevelDataListBuilder_.dispose();
              gearLevelDataListBuilder_ = null;
              gearLevelDataList_ = other.gearLevelDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              gearLevelDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getGearLevelDataListFieldBuilder() : null;
            } else {
              gearLevelDataListBuilder_.addAllMessages(other.gearLevelDataList_);
            }
          }
        }
        if (other.hasJigsawPictureData()) {
          mergeJigsawPictureData(other.getJigsawPictureData());
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
        GearInfoOuterClass.GearInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GearInfoOuterClass.GearInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<GearLevelDataOuterClass.GearLevelData> gearLevelDataList_ =
        java.util.Collections.emptyList();
      private void ensureGearLevelDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          gearLevelDataList_ = new java.util.ArrayList<GearLevelDataOuterClass.GearLevelData>(gearLevelDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          GearLevelDataOuterClass.GearLevelData, GearLevelDataOuterClass.GearLevelData.Builder, GearLevelDataOuterClass.GearLevelDataOrBuilder> gearLevelDataListBuilder_;

      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public java.util.List<GearLevelDataOuterClass.GearLevelData> getGearLevelDataListList() {
        if (gearLevelDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(gearLevelDataList_);
        } else {
          return gearLevelDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public int getGearLevelDataListCount() {
        if (gearLevelDataListBuilder_ == null) {
          return gearLevelDataList_.size();
        } else {
          return gearLevelDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public GearLevelDataOuterClass.GearLevelData getGearLevelDataList(int index) {
        if (gearLevelDataListBuilder_ == null) {
          return gearLevelDataList_.get(index);
        } else {
          return gearLevelDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public Builder setGearLevelDataList(
          int index, GearLevelDataOuterClass.GearLevelData value) {
        if (gearLevelDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGearLevelDataListIsMutable();
          gearLevelDataList_.set(index, value);
          onChanged();
        } else {
          gearLevelDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public Builder setGearLevelDataList(
          int index, GearLevelDataOuterClass.GearLevelData.Builder builderForValue) {
        if (gearLevelDataListBuilder_ == null) {
          ensureGearLevelDataListIsMutable();
          gearLevelDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          gearLevelDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public Builder addGearLevelDataList(GearLevelDataOuterClass.GearLevelData value) {
        if (gearLevelDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGearLevelDataListIsMutable();
          gearLevelDataList_.add(value);
          onChanged();
        } else {
          gearLevelDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public Builder addGearLevelDataList(
          int index, GearLevelDataOuterClass.GearLevelData value) {
        if (gearLevelDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGearLevelDataListIsMutable();
          gearLevelDataList_.add(index, value);
          onChanged();
        } else {
          gearLevelDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public Builder addGearLevelDataList(
          GearLevelDataOuterClass.GearLevelData.Builder builderForValue) {
        if (gearLevelDataListBuilder_ == null) {
          ensureGearLevelDataListIsMutable();
          gearLevelDataList_.add(builderForValue.build());
          onChanged();
        } else {
          gearLevelDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public Builder addGearLevelDataList(
          int index, GearLevelDataOuterClass.GearLevelData.Builder builderForValue) {
        if (gearLevelDataListBuilder_ == null) {
          ensureGearLevelDataListIsMutable();
          gearLevelDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          gearLevelDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public Builder addAllGearLevelDataList(
          java.lang.Iterable<? extends GearLevelDataOuterClass.GearLevelData> values) {
        if (gearLevelDataListBuilder_ == null) {
          ensureGearLevelDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, gearLevelDataList_);
          onChanged();
        } else {
          gearLevelDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public Builder clearGearLevelDataList() {
        if (gearLevelDataListBuilder_ == null) {
          gearLevelDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          gearLevelDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public Builder removeGearLevelDataList(int index) {
        if (gearLevelDataListBuilder_ == null) {
          ensureGearLevelDataListIsMutable();
          gearLevelDataList_.remove(index);
          onChanged();
        } else {
          gearLevelDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public GearLevelDataOuterClass.GearLevelData.Builder getGearLevelDataListBuilder(
          int index) {
        return getGearLevelDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public GearLevelDataOuterClass.GearLevelDataOrBuilder getGearLevelDataListOrBuilder(
          int index) {
        if (gearLevelDataListBuilder_ == null) {
          return gearLevelDataList_.get(index);  } else {
          return gearLevelDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public java.util.List<? extends GearLevelDataOuterClass.GearLevelDataOrBuilder> 
           getGearLevelDataListOrBuilderList() {
        if (gearLevelDataListBuilder_ != null) {
          return gearLevelDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(gearLevelDataList_);
        }
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public GearLevelDataOuterClass.GearLevelData.Builder addGearLevelDataListBuilder() {
        return getGearLevelDataListFieldBuilder().addBuilder(
            GearLevelDataOuterClass.GearLevelData.getDefaultInstance());
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public GearLevelDataOuterClass.GearLevelData.Builder addGearLevelDataListBuilder(
          int index) {
        return getGearLevelDataListFieldBuilder().addBuilder(
            index, GearLevelDataOuterClass.GearLevelData.getDefaultInstance());
      }
      /**
       * <code>repeated .GearLevelData gearLevelDataList = 9;</code>
       */
      public java.util.List<GearLevelDataOuterClass.GearLevelData.Builder> 
           getGearLevelDataListBuilderList() {
        return getGearLevelDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          GearLevelDataOuterClass.GearLevelData, GearLevelDataOuterClass.GearLevelData.Builder, GearLevelDataOuterClass.GearLevelDataOrBuilder> 
          getGearLevelDataListFieldBuilder() {
        if (gearLevelDataListBuilder_ == null) {
          gearLevelDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              GearLevelDataOuterClass.GearLevelData, GearLevelDataOuterClass.GearLevelData.Builder, GearLevelDataOuterClass.GearLevelDataOrBuilder>(
                  gearLevelDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          gearLevelDataList_ = null;
        }
        return gearLevelDataListBuilder_;
      }

      private JigsawPictureDataOuterClass.JigsawPictureData jigsawPictureData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          JigsawPictureDataOuterClass.JigsawPictureData, JigsawPictureDataOuterClass.JigsawPictureData.Builder, JigsawPictureDataOuterClass.JigsawPictureDataOrBuilder> jigsawPictureDataBuilder_;
      /**
       * <code>.JigsawPictureData jigsawPictureData = 13;</code>
       * @return Whether the jigsawPictureData field is set.
       */
      public boolean hasJigsawPictureData() {
        return jigsawPictureDataBuilder_ != null || jigsawPictureData_ != null;
      }
      /**
       * <code>.JigsawPictureData jigsawPictureData = 13;</code>
       * @return The jigsawPictureData.
       */
      public JigsawPictureDataOuterClass.JigsawPictureData getJigsawPictureData() {
        if (jigsawPictureDataBuilder_ == null) {
          return jigsawPictureData_ == null ? JigsawPictureDataOuterClass.JigsawPictureData.getDefaultInstance() : jigsawPictureData_;
        } else {
          return jigsawPictureDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.JigsawPictureData jigsawPictureData = 13;</code>
       */
      public Builder setJigsawPictureData(JigsawPictureDataOuterClass.JigsawPictureData value) {
        if (jigsawPictureDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          jigsawPictureData_ = value;
          onChanged();
        } else {
          jigsawPictureDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.JigsawPictureData jigsawPictureData = 13;</code>
       */
      public Builder setJigsawPictureData(
          JigsawPictureDataOuterClass.JigsawPictureData.Builder builderForValue) {
        if (jigsawPictureDataBuilder_ == null) {
          jigsawPictureData_ = builderForValue.build();
          onChanged();
        } else {
          jigsawPictureDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.JigsawPictureData jigsawPictureData = 13;</code>
       */
      public Builder mergeJigsawPictureData(JigsawPictureDataOuterClass.JigsawPictureData value) {
        if (jigsawPictureDataBuilder_ == null) {
          if (jigsawPictureData_ != null) {
            jigsawPictureData_ =
              JigsawPictureDataOuterClass.JigsawPictureData.newBuilder(jigsawPictureData_).mergeFrom(value).buildPartial();
          } else {
            jigsawPictureData_ = value;
          }
          onChanged();
        } else {
          jigsawPictureDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.JigsawPictureData jigsawPictureData = 13;</code>
       */
      public Builder clearJigsawPictureData() {
        if (jigsawPictureDataBuilder_ == null) {
          jigsawPictureData_ = null;
          onChanged();
        } else {
          jigsawPictureData_ = null;
          jigsawPictureDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.JigsawPictureData jigsawPictureData = 13;</code>
       */
      public JigsawPictureDataOuterClass.JigsawPictureData.Builder getJigsawPictureDataBuilder() {
        
        onChanged();
        return getJigsawPictureDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.JigsawPictureData jigsawPictureData = 13;</code>
       */
      public JigsawPictureDataOuterClass.JigsawPictureDataOrBuilder getJigsawPictureDataOrBuilder() {
        if (jigsawPictureDataBuilder_ != null) {
          return jigsawPictureDataBuilder_.getMessageOrBuilder();
        } else {
          return jigsawPictureData_ == null ?
              JigsawPictureDataOuterClass.JigsawPictureData.getDefaultInstance() : jigsawPictureData_;
        }
      }
      /**
       * <code>.JigsawPictureData jigsawPictureData = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          JigsawPictureDataOuterClass.JigsawPictureData, JigsawPictureDataOuterClass.JigsawPictureData.Builder, JigsawPictureDataOuterClass.JigsawPictureDataOrBuilder> 
          getJigsawPictureDataFieldBuilder() {
        if (jigsawPictureDataBuilder_ == null) {
          jigsawPictureDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              JigsawPictureDataOuterClass.JigsawPictureData, JigsawPictureDataOuterClass.JigsawPictureData.Builder, JigsawPictureDataOuterClass.JigsawPictureDataOrBuilder>(
                  getJigsawPictureData(),
                  getParentForChildren(),
                  isClean());
          jigsawPictureData_ = null;
        }
        return jigsawPictureDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GearInfo)
    }

    // @@protoc_insertion_point(class_scope:GearInfo)
    private static final GearInfoOuterClass.GearInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GearInfoOuterClass.GearInfo();
    }

    public static GearInfoOuterClass.GearInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GearInfo>
        PARSER = new com.google.protobuf.AbstractParser<GearInfo>() {
      @java.lang.Override
      public GearInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GearInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GearInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GearInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GearInfoOuterClass.GearInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GearInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GearInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016GearInfo.proto\032\027JigsawPictureData.prot" +
      "o\032\023GearLevelData.proto\"d\n\010GearInfo\022)\n\021ge" +
      "arLevelDataList\030\t \003(\0132\016.GearLevelData\022-\n" +
      "\021jigsawPictureData\030\r \001(\0132\022.JigsawPicture" +
      "Datab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          JigsawPictureDataOuterClass.getDescriptor(),
          GearLevelDataOuterClass.getDescriptor(),
        });
    internal_static_GearInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GearInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GearInfo_descriptor,
        new java.lang.String[] { "GearLevelDataList", "JigsawPictureData", });
    JigsawPictureDataOuterClass.getDescriptor();
    GearLevelDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
