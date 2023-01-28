// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonSocial.proto

public final class CustomDungeonSocialOuterClass {
  private CustomDungeonSocialOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomDungeonSocialOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomDungeonSocial)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 storeNum = 7;</code>
     * @return The storeNum.
     */
    int getStoreNum();

    /**
     * <code>uint32 winNum = 11;</code>
     * @return The winNum.
     */
    int getWinNum();

    /**
     * <code>uint32 likeNum = 6;</code>
     * @return The likeNum.
     */
    int getLikeNum();

    /**
     * <code>uint32 playNum = 12;</code>
     * @return The playNum.
     */
    int getPlayNum();
  }
  /**
   * Protobuf type {@code CustomDungeonSocial}
   */
  public static final class CustomDungeonSocial extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomDungeonSocial)
      CustomDungeonSocialOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomDungeonSocial.newBuilder() to construct.
    private CustomDungeonSocial(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomDungeonSocial() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomDungeonSocial();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CustomDungeonSocial(
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

              likeNum_ = input.readUInt32();
              break;
            }
            case 56: {

              storeNum_ = input.readUInt32();
              break;
            }
            case 88: {

              winNum_ = input.readUInt32();
              break;
            }
            case 96: {

              playNum_ = input.readUInt32();
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
      return CustomDungeonSocialOuterClass.internal_static_CustomDungeonSocial_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CustomDungeonSocialOuterClass.internal_static_CustomDungeonSocial_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CustomDungeonSocialOuterClass.CustomDungeonSocial.class, CustomDungeonSocialOuterClass.CustomDungeonSocial.Builder.class);
    }

    public static final int STORENUM_FIELD_NUMBER = 7;
    private int storeNum_;
    /**
     * <code>uint32 storeNum = 7;</code>
     * @return The storeNum.
     */
    @java.lang.Override
    public int getStoreNum() {
      return storeNum_;
    }

    public static final int WINNUM_FIELD_NUMBER = 11;
    private int winNum_;
    /**
     * <code>uint32 winNum = 11;</code>
     * @return The winNum.
     */
    @java.lang.Override
    public int getWinNum() {
      return winNum_;
    }

    public static final int LIKENUM_FIELD_NUMBER = 6;
    private int likeNum_;
    /**
     * <code>uint32 likeNum = 6;</code>
     * @return The likeNum.
     */
    @java.lang.Override
    public int getLikeNum() {
      return likeNum_;
    }

    public static final int PLAYNUM_FIELD_NUMBER = 12;
    private int playNum_;
    /**
     * <code>uint32 playNum = 12;</code>
     * @return The playNum.
     */
    @java.lang.Override
    public int getPlayNum() {
      return playNum_;
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
      if (likeNum_ != 0) {
        output.writeUInt32(6, likeNum_);
      }
      if (storeNum_ != 0) {
        output.writeUInt32(7, storeNum_);
      }
      if (winNum_ != 0) {
        output.writeUInt32(11, winNum_);
      }
      if (playNum_ != 0) {
        output.writeUInt32(12, playNum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (likeNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, likeNum_);
      }
      if (storeNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, storeNum_);
      }
      if (winNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, winNum_);
      }
      if (playNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, playNum_);
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
      if (!(obj instanceof CustomDungeonSocialOuterClass.CustomDungeonSocial)) {
        return super.equals(obj);
      }
      CustomDungeonSocialOuterClass.CustomDungeonSocial other = (CustomDungeonSocialOuterClass.CustomDungeonSocial) obj;

      if (getStoreNum()
          != other.getStoreNum()) return false;
      if (getWinNum()
          != other.getWinNum()) return false;
      if (getLikeNum()
          != other.getLikeNum()) return false;
      if (getPlayNum()
          != other.getPlayNum()) return false;
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
      hash = (37 * hash) + STORENUM_FIELD_NUMBER;
      hash = (53 * hash) + getStoreNum();
      hash = (37 * hash) + WINNUM_FIELD_NUMBER;
      hash = (53 * hash) + getWinNum();
      hash = (37 * hash) + LIKENUM_FIELD_NUMBER;
      hash = (53 * hash) + getLikeNum();
      hash = (37 * hash) + PLAYNUM_FIELD_NUMBER;
      hash = (53 * hash) + getPlayNum();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static CustomDungeonSocialOuterClass.CustomDungeonSocial parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CustomDungeonSocialOuterClass.CustomDungeonSocial parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CustomDungeonSocialOuterClass.CustomDungeonSocial parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CustomDungeonSocialOuterClass.CustomDungeonSocial parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CustomDungeonSocialOuterClass.CustomDungeonSocial parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CustomDungeonSocialOuterClass.CustomDungeonSocial parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CustomDungeonSocialOuterClass.CustomDungeonSocial parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CustomDungeonSocialOuterClass.CustomDungeonSocial parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static CustomDungeonSocialOuterClass.CustomDungeonSocial parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static CustomDungeonSocialOuterClass.CustomDungeonSocial parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static CustomDungeonSocialOuterClass.CustomDungeonSocial parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CustomDungeonSocialOuterClass.CustomDungeonSocial parseFrom(
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
    public static Builder newBuilder(CustomDungeonSocialOuterClass.CustomDungeonSocial prototype) {
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
     * Protobuf type {@code CustomDungeonSocial}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomDungeonSocial)
        CustomDungeonSocialOuterClass.CustomDungeonSocialOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CustomDungeonSocialOuterClass.internal_static_CustomDungeonSocial_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CustomDungeonSocialOuterClass.internal_static_CustomDungeonSocial_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CustomDungeonSocialOuterClass.CustomDungeonSocial.class, CustomDungeonSocialOuterClass.CustomDungeonSocial.Builder.class);
      }

      // Construct using CustomDungeonSocialOuterClass.CustomDungeonSocial.newBuilder()
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
        storeNum_ = 0;

        winNum_ = 0;

        likeNum_ = 0;

        playNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CustomDungeonSocialOuterClass.internal_static_CustomDungeonSocial_descriptor;
      }

      @java.lang.Override
      public CustomDungeonSocialOuterClass.CustomDungeonSocial getDefaultInstanceForType() {
        return CustomDungeonSocialOuterClass.CustomDungeonSocial.getDefaultInstance();
      }

      @java.lang.Override
      public CustomDungeonSocialOuterClass.CustomDungeonSocial build() {
        CustomDungeonSocialOuterClass.CustomDungeonSocial result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public CustomDungeonSocialOuterClass.CustomDungeonSocial buildPartial() {
        CustomDungeonSocialOuterClass.CustomDungeonSocial result = new CustomDungeonSocialOuterClass.CustomDungeonSocial(this);
        result.storeNum_ = storeNum_;
        result.winNum_ = winNum_;
        result.likeNum_ = likeNum_;
        result.playNum_ = playNum_;
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
        if (other instanceof CustomDungeonSocialOuterClass.CustomDungeonSocial) {
          return mergeFrom((CustomDungeonSocialOuterClass.CustomDungeonSocial)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CustomDungeonSocialOuterClass.CustomDungeonSocial other) {
        if (other == CustomDungeonSocialOuterClass.CustomDungeonSocial.getDefaultInstance()) return this;
        if (other.getStoreNum() != 0) {
          setStoreNum(other.getStoreNum());
        }
        if (other.getWinNum() != 0) {
          setWinNum(other.getWinNum());
        }
        if (other.getLikeNum() != 0) {
          setLikeNum(other.getLikeNum());
        }
        if (other.getPlayNum() != 0) {
          setPlayNum(other.getPlayNum());
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
        CustomDungeonSocialOuterClass.CustomDungeonSocial parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CustomDungeonSocialOuterClass.CustomDungeonSocial) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int storeNum_ ;
      /**
       * <code>uint32 storeNum = 7;</code>
       * @return The storeNum.
       */
      @java.lang.Override
      public int getStoreNum() {
        return storeNum_;
      }
      /**
       * <code>uint32 storeNum = 7;</code>
       * @param value The storeNum to set.
       * @return This builder for chaining.
       */
      public Builder setStoreNum(int value) {
        
        storeNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 storeNum = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreNum() {
        
        storeNum_ = 0;
        onChanged();
        return this;
      }

      private int winNum_ ;
      /**
       * <code>uint32 winNum = 11;</code>
       * @return The winNum.
       */
      @java.lang.Override
      public int getWinNum() {
        return winNum_;
      }
      /**
       * <code>uint32 winNum = 11;</code>
       * @param value The winNum to set.
       * @return This builder for chaining.
       */
      public Builder setWinNum(int value) {
        
        winNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 winNum = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearWinNum() {
        
        winNum_ = 0;
        onChanged();
        return this;
      }

      private int likeNum_ ;
      /**
       * <code>uint32 likeNum = 6;</code>
       * @return The likeNum.
       */
      @java.lang.Override
      public int getLikeNum() {
        return likeNum_;
      }
      /**
       * <code>uint32 likeNum = 6;</code>
       * @param value The likeNum to set.
       * @return This builder for chaining.
       */
      public Builder setLikeNum(int value) {
        
        likeNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 likeNum = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLikeNum() {
        
        likeNum_ = 0;
        onChanged();
        return this;
      }

      private int playNum_ ;
      /**
       * <code>uint32 playNum = 12;</code>
       * @return The playNum.
       */
      @java.lang.Override
      public int getPlayNum() {
        return playNum_;
      }
      /**
       * <code>uint32 playNum = 12;</code>
       * @param value The playNum to set.
       * @return This builder for chaining.
       */
      public Builder setPlayNum(int value) {
        
        playNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 playNum = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayNum() {
        
        playNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CustomDungeonSocial)
    }

    // @@protoc_insertion_point(class_scope:CustomDungeonSocial)
    private static final CustomDungeonSocialOuterClass.CustomDungeonSocial DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CustomDungeonSocialOuterClass.CustomDungeonSocial();
    }

    public static CustomDungeonSocialOuterClass.CustomDungeonSocial getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomDungeonSocial>
        PARSER = new com.google.protobuf.AbstractParser<CustomDungeonSocial>() {
      @java.lang.Override
      public CustomDungeonSocial parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CustomDungeonSocial(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CustomDungeonSocial> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomDungeonSocial> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public CustomDungeonSocialOuterClass.CustomDungeonSocial getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomDungeonSocial_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomDungeonSocial_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031CustomDungeonSocial.proto\"Y\n\023CustomDun" +
      "geonSocial\022\020\n\010storeNum\030\007 \001(\r\022\016\n\006winNum\030\013" +
      " \001(\r\022\017\n\007likeNum\030\006 \001(\r\022\017\n\007playNum\030\014 \001(\rb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CustomDungeonSocial_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomDungeonSocial_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomDungeonSocial_descriptor,
        new java.lang.String[] { "StoreNum", "WinNum", "LikeNum", "PlayNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
