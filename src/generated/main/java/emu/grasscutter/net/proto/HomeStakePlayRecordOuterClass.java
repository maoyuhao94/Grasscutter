// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeStakePlayRecord.proto

package emu.grasscutter.net.proto;

public final class HomeStakePlayRecordOuterClass {
  private HomeStakePlayRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeStakePlayRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeStakePlayRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
     */
    java.util.List<emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo> 
        getEngagedPlayerInfoListList();
    /**
     * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
     */
    emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo getEngagedPlayerInfoList(int index);
    /**
     * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
     */
    int getEngagedPlayerInfoListCount();
    /**
     * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder> 
        getEngagedPlayerInfoListOrBuilderList();
    /**
     * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
     */
    emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder getEngagedPlayerInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 timestamp = 3;</code>
     * @return The timestamp.
     */
    int getTimestamp();
  }
  /**
   * Protobuf type {@code HomeStakePlayRecord}
   */
  public static final class HomeStakePlayRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeStakePlayRecord)
      HomeStakePlayRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeStakePlayRecord.newBuilder() to construct.
    private HomeStakePlayRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeStakePlayRecord() {
      engagedPlayerInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeStakePlayRecord();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeStakePlayRecord(
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
            case 24: {

              timestamp_ = input.readUInt32();
              break;
            }
            case 58: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                engagedPlayerInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              engagedPlayerInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.parser(), extensionRegistry));
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
          engagedPlayerInfoList_ = java.util.Collections.unmodifiableList(engagedPlayerInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.internal_static_HomeStakePlayRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.internal_static_HomeStakePlayRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord.class, emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord.Builder.class);
    }

    public static final int ENGAGED_PLAYER_INFO_LIST_FIELD_NUMBER = 7;
    private java.util.List<emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo> engagedPlayerInfoList_;
    /**
     * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo> getEngagedPlayerInfoListList() {
      return engagedPlayerInfoList_;
    }
    /**
     * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder> 
        getEngagedPlayerInfoListOrBuilderList() {
      return engagedPlayerInfoList_;
    }
    /**
     * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
     */
    @java.lang.Override
    public int getEngagedPlayerInfoListCount() {
      return engagedPlayerInfoList_.size();
    }
    /**
     * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo getEngagedPlayerInfoList(int index) {
      return engagedPlayerInfoList_.get(index);
    }
    /**
     * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder getEngagedPlayerInfoListOrBuilder(
        int index) {
      return engagedPlayerInfoList_.get(index);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private int timestamp_;
    /**
     * <code>uint32 timestamp = 3;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public int getTimestamp() {
      return timestamp_;
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
      if (timestamp_ != 0) {
        output.writeUInt32(3, timestamp_);
      }
      for (int i = 0; i < engagedPlayerInfoList_.size(); i++) {
        output.writeMessage(7, engagedPlayerInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (timestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, timestamp_);
      }
      for (int i = 0; i < engagedPlayerInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, engagedPlayerInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord other = (emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord) obj;

      if (!getEngagedPlayerInfoListList()
          .equals(other.getEngagedPlayerInfoListList())) return false;
      if (getTimestamp()
          != other.getTimestamp()) return false;
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
      if (getEngagedPlayerInfoListCount() > 0) {
        hash = (37 * hash) + ENGAGED_PLAYER_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEngagedPlayerInfoListList().hashCode();
      }
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord prototype) {
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
     * Protobuf type {@code HomeStakePlayRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeStakePlayRecord)
        emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.internal_static_HomeStakePlayRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.internal_static_HomeStakePlayRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord.class, emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord.newBuilder()
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
          getEngagedPlayerInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (engagedPlayerInfoListBuilder_ == null) {
          engagedPlayerInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          engagedPlayerInfoListBuilder_.clear();
        }
        timestamp_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.internal_static_HomeStakePlayRecord_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord build() {
        emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord buildPartial() {
        emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord result = new emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord(this);
        int from_bitField0_ = bitField0_;
        if (engagedPlayerInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            engagedPlayerInfoList_ = java.util.Collections.unmodifiableList(engagedPlayerInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.engagedPlayerInfoList_ = engagedPlayerInfoList_;
        } else {
          result.engagedPlayerInfoList_ = engagedPlayerInfoListBuilder_.build();
        }
        result.timestamp_ = timestamp_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord) {
          return mergeFrom((emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord other) {
        if (other == emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord.getDefaultInstance()) return this;
        if (engagedPlayerInfoListBuilder_ == null) {
          if (!other.engagedPlayerInfoList_.isEmpty()) {
            if (engagedPlayerInfoList_.isEmpty()) {
              engagedPlayerInfoList_ = other.engagedPlayerInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEngagedPlayerInfoListIsMutable();
              engagedPlayerInfoList_.addAll(other.engagedPlayerInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.engagedPlayerInfoList_.isEmpty()) {
            if (engagedPlayerInfoListBuilder_.isEmpty()) {
              engagedPlayerInfoListBuilder_.dispose();
              engagedPlayerInfoListBuilder_ = null;
              engagedPlayerInfoList_ = other.engagedPlayerInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              engagedPlayerInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEngagedPlayerInfoListFieldBuilder() : null;
            } else {
              engagedPlayerInfoListBuilder_.addAllMessages(other.engagedPlayerInfoList_);
            }
          }
        }
        if (other.getTimestamp() != 0) {
          setTimestamp(other.getTimestamp());
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
        emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo> engagedPlayerInfoList_ =
        java.util.Collections.emptyList();
      private void ensureEngagedPlayerInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          engagedPlayerInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo>(engagedPlayerInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder> engagedPlayerInfoListBuilder_;

      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo> getEngagedPlayerInfoListList() {
        if (engagedPlayerInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(engagedPlayerInfoList_);
        } else {
          return engagedPlayerInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public int getEngagedPlayerInfoListCount() {
        if (engagedPlayerInfoListBuilder_ == null) {
          return engagedPlayerInfoList_.size();
        } else {
          return engagedPlayerInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo getEngagedPlayerInfoList(int index) {
        if (engagedPlayerInfoListBuilder_ == null) {
          return engagedPlayerInfoList_.get(index);
        } else {
          return engagedPlayerInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public Builder setEngagedPlayerInfoList(
          int index, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo value) {
        if (engagedPlayerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEngagedPlayerInfoListIsMutable();
          engagedPlayerInfoList_.set(index, value);
          onChanged();
        } else {
          engagedPlayerInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public Builder setEngagedPlayerInfoList(
          int index, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder builderForValue) {
        if (engagedPlayerInfoListBuilder_ == null) {
          ensureEngagedPlayerInfoListIsMutable();
          engagedPlayerInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          engagedPlayerInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public Builder addEngagedPlayerInfoList(emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo value) {
        if (engagedPlayerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEngagedPlayerInfoListIsMutable();
          engagedPlayerInfoList_.add(value);
          onChanged();
        } else {
          engagedPlayerInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public Builder addEngagedPlayerInfoList(
          int index, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo value) {
        if (engagedPlayerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEngagedPlayerInfoListIsMutable();
          engagedPlayerInfoList_.add(index, value);
          onChanged();
        } else {
          engagedPlayerInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public Builder addEngagedPlayerInfoList(
          emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder builderForValue) {
        if (engagedPlayerInfoListBuilder_ == null) {
          ensureEngagedPlayerInfoListIsMutable();
          engagedPlayerInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          engagedPlayerInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public Builder addEngagedPlayerInfoList(
          int index, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder builderForValue) {
        if (engagedPlayerInfoListBuilder_ == null) {
          ensureEngagedPlayerInfoListIsMutable();
          engagedPlayerInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          engagedPlayerInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public Builder addAllEngagedPlayerInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo> values) {
        if (engagedPlayerInfoListBuilder_ == null) {
          ensureEngagedPlayerInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, engagedPlayerInfoList_);
          onChanged();
        } else {
          engagedPlayerInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public Builder clearEngagedPlayerInfoList() {
        if (engagedPlayerInfoListBuilder_ == null) {
          engagedPlayerInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          engagedPlayerInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public Builder removeEngagedPlayerInfoList(int index) {
        if (engagedPlayerInfoListBuilder_ == null) {
          ensureEngagedPlayerInfoListIsMutable();
          engagedPlayerInfoList_.remove(index);
          onChanged();
        } else {
          engagedPlayerInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder getEngagedPlayerInfoListBuilder(
          int index) {
        return getEngagedPlayerInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder getEngagedPlayerInfoListOrBuilder(
          int index) {
        if (engagedPlayerInfoListBuilder_ == null) {
          return engagedPlayerInfoList_.get(index);  } else {
          return engagedPlayerInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder> 
           getEngagedPlayerInfoListOrBuilderList() {
        if (engagedPlayerInfoListBuilder_ != null) {
          return engagedPlayerInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(engagedPlayerInfoList_);
        }
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder addEngagedPlayerInfoListBuilder() {
        return getEngagedPlayerInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder addEngagedPlayerInfoListBuilder(
          int index) {
        return getEngagedPlayerInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeGroupPlayerInfo engaged_player_info_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder> 
           getEngagedPlayerInfoListBuilderList() {
        return getEngagedPlayerInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder> 
          getEngagedPlayerInfoListFieldBuilder() {
        if (engagedPlayerInfoListBuilder_ == null) {
          engagedPlayerInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder>(
                  engagedPlayerInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          engagedPlayerInfoList_ = null;
        }
        return engagedPlayerInfoListBuilder_;
      }

      private int timestamp_ ;
      /**
       * <code>uint32 timestamp = 3;</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public int getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>uint32 timestamp = 3;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(int value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 timestamp = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeStakePlayRecord)
    }

    // @@protoc_insertion_point(class_scope:HomeStakePlayRecord)
    private static final emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord();
    }

    public static emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeStakePlayRecord>
        PARSER = new com.google.protobuf.AbstractParser<HomeStakePlayRecord>() {
      @java.lang.Override
      public HomeStakePlayRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeStakePlayRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeStakePlayRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeStakePlayRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeStakePlayRecordOuterClass.HomeStakePlayRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeStakePlayRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeStakePlayRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031HomeStakePlayRecord.proto\032\031HomeGroupPl" +
      "ayerInfo.proto\"`\n\023HomeStakePlayRecord\0226\n" +
      "\030engaged_player_info_list\030\007 \003(\0132\024.HomeGr" +
      "oupPlayerInfo\022\021\n\ttimestamp\030\003 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeStakePlayRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeStakePlayRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeStakePlayRecord_descriptor,
        new java.lang.String[] { "EngagedPlayerInfoList", "Timestamp", });
    emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
