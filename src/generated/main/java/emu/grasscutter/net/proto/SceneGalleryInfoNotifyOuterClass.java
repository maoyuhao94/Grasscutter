// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryInfoNotify.proto

public final class SceneGalleryInfoNotifyOuterClass {
  private SceneGalleryInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.SceneGalleryInfo galleryInfo = 7;</code>
     * @return Whether the galleryInfo field is set.
     */
    boolean hasGalleryInfo();
    /**
     * <code>.SceneGalleryInfo galleryInfo = 7;</code>
     * @return The galleryInfo.
     */
    SceneGalleryInfoOuterClass.SceneGalleryInfo getGalleryInfo();
    /**
     * <code>.SceneGalleryInfo galleryInfo = 7;</code>
     */
    SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder getGalleryInfoOrBuilder();
  }
  /**
   * Protobuf type {@code SceneGalleryInfoNotify}
   */
  public static final class SceneGalleryInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryInfoNotify)
      SceneGalleryInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryInfoNotify.newBuilder() to construct.
    private SceneGalleryInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryInfoNotify(
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
            case 58: {
              SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder subBuilder = null;
              if (galleryInfo_ != null) {
                subBuilder = galleryInfo_.toBuilder();
              }
              galleryInfo_ = input.readMessage(SceneGalleryInfoOuterClass.SceneGalleryInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(galleryInfo_);
                galleryInfo_ = subBuilder.buildPartial();
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
      return SceneGalleryInfoNotifyOuterClass.internal_static_SceneGalleryInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SceneGalleryInfoNotifyOuterClass.internal_static_SceneGalleryInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.class, SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code SceneGalleryInfoNotify.KHBMFBHDECI}
     */
    public enum KHBMFBHDECI
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 5513;</code>
       */
      PEPPOHPHJOJ(1, 5513),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final KHBMFBHDECI DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 5513;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 5513;
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
      public static KHBMFBHDECI valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static KHBMFBHDECI forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 5513: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<KHBMFBHDECI>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          KHBMFBHDECI> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<KHBMFBHDECI>() {
              public KHBMFBHDECI findValueByNumber(int number) {
                return KHBMFBHDECI.forNumber(number);
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
        return SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final KHBMFBHDECI[] VALUES = getStaticValuesArray();
      private static KHBMFBHDECI[] getStaticValuesArray() {
        return new KHBMFBHDECI[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static KHBMFBHDECI valueOf(
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

      private KHBMFBHDECI(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SceneGalleryInfoNotify.KHBMFBHDECI)
    }

    public static final int GALLERYINFO_FIELD_NUMBER = 7;
    private SceneGalleryInfoOuterClass.SceneGalleryInfo galleryInfo_;
    /**
     * <code>.SceneGalleryInfo galleryInfo = 7;</code>
     * @return Whether the galleryInfo field is set.
     */
    @java.lang.Override
    public boolean hasGalleryInfo() {
      return galleryInfo_ != null;
    }
    /**
     * <code>.SceneGalleryInfo galleryInfo = 7;</code>
     * @return The galleryInfo.
     */
    @java.lang.Override
    public SceneGalleryInfoOuterClass.SceneGalleryInfo getGalleryInfo() {
      return galleryInfo_ == null ? SceneGalleryInfoOuterClass.SceneGalleryInfo.getDefaultInstance() : galleryInfo_;
    }
    /**
     * <code>.SceneGalleryInfo galleryInfo = 7;</code>
     */
    @java.lang.Override
    public SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder getGalleryInfoOrBuilder() {
      return getGalleryInfo();
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
      if (galleryInfo_ != null) {
        output.writeMessage(7, getGalleryInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getGalleryInfo());
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
      if (!(obj instanceof SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify)) {
        return super.equals(obj);
      }
      SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify other = (SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify) obj;

      if (hasGalleryInfo() != other.hasGalleryInfo()) return false;
      if (hasGalleryInfo()) {
        if (!getGalleryInfo()
            .equals(other.getGalleryInfo())) return false;
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
      if (hasGalleryInfo()) {
        hash = (37 * hash) + GALLERYINFO_FIELD_NUMBER;
        hash = (53 * hash) + getGalleryInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
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
    public static Builder newBuilder(SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify prototype) {
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
     * Protobuf type {@code SceneGalleryInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryInfoNotify)
        SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SceneGalleryInfoNotifyOuterClass.internal_static_SceneGalleryInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SceneGalleryInfoNotifyOuterClass.internal_static_SceneGalleryInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.class, SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.Builder.class);
      }

      // Construct using SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.newBuilder()
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
        if (galleryInfoBuilder_ == null) {
          galleryInfo_ = null;
        } else {
          galleryInfo_ = null;
          galleryInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SceneGalleryInfoNotifyOuterClass.internal_static_SceneGalleryInfoNotify_descriptor;
      }

      @java.lang.Override
      public SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify getDefaultInstanceForType() {
        return SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify build() {
        SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify buildPartial() {
        SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify result = new SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify(this);
        if (galleryInfoBuilder_ == null) {
          result.galleryInfo_ = galleryInfo_;
        } else {
          result.galleryInfo_ = galleryInfoBuilder_.build();
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
        if (other instanceof SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify) {
          return mergeFrom((SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify other) {
        if (other == SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.getDefaultInstance()) return this;
        if (other.hasGalleryInfo()) {
          mergeGalleryInfo(other.getGalleryInfo());
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
        SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private SceneGalleryInfoOuterClass.SceneGalleryInfo galleryInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          SceneGalleryInfoOuterClass.SceneGalleryInfo, SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder, SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder> galleryInfoBuilder_;
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       * @return Whether the galleryInfo field is set.
       */
      public boolean hasGalleryInfo() {
        return galleryInfoBuilder_ != null || galleryInfo_ != null;
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       * @return The galleryInfo.
       */
      public SceneGalleryInfoOuterClass.SceneGalleryInfo getGalleryInfo() {
        if (galleryInfoBuilder_ == null) {
          return galleryInfo_ == null ? SceneGalleryInfoOuterClass.SceneGalleryInfo.getDefaultInstance() : galleryInfo_;
        } else {
          return galleryInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      public Builder setGalleryInfo(SceneGalleryInfoOuterClass.SceneGalleryInfo value) {
        if (galleryInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          galleryInfo_ = value;
          onChanged();
        } else {
          galleryInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      public Builder setGalleryInfo(
          SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder builderForValue) {
        if (galleryInfoBuilder_ == null) {
          galleryInfo_ = builderForValue.build();
          onChanged();
        } else {
          galleryInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      public Builder mergeGalleryInfo(SceneGalleryInfoOuterClass.SceneGalleryInfo value) {
        if (galleryInfoBuilder_ == null) {
          if (galleryInfo_ != null) {
            galleryInfo_ =
              SceneGalleryInfoOuterClass.SceneGalleryInfo.newBuilder(galleryInfo_).mergeFrom(value).buildPartial();
          } else {
            galleryInfo_ = value;
          }
          onChanged();
        } else {
          galleryInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      public Builder clearGalleryInfo() {
        if (galleryInfoBuilder_ == null) {
          galleryInfo_ = null;
          onChanged();
        } else {
          galleryInfo_ = null;
          galleryInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      public SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder getGalleryInfoBuilder() {
        
        onChanged();
        return getGalleryInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      public SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder getGalleryInfoOrBuilder() {
        if (galleryInfoBuilder_ != null) {
          return galleryInfoBuilder_.getMessageOrBuilder();
        } else {
          return galleryInfo_ == null ?
              SceneGalleryInfoOuterClass.SceneGalleryInfo.getDefaultInstance() : galleryInfo_;
        }
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          SceneGalleryInfoOuterClass.SceneGalleryInfo, SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder, SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder> 
          getGalleryInfoFieldBuilder() {
        if (galleryInfoBuilder_ == null) {
          galleryInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              SceneGalleryInfoOuterClass.SceneGalleryInfo, SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder, SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder>(
                  getGalleryInfo(),
                  getParentForChildren(),
                  isClean());
          galleryInfo_ = null;
        }
        return galleryInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryInfoNotify)
    private static final SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify();
    }

    public static SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryInfoNotify>() {
      @java.lang.Override
      public SceneGalleryInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SceneGalleryInfoNotify.proto\032\026SceneGal" +
      "leryInfo.proto\"\221\001\n\026SceneGalleryInfoNotif" +
      "y\022&\n\013galleryInfo\030\007 \001(\0132\021.SceneGalleryInf" +
      "o\"O\n\013KHBMFBHDECI\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJO" +
      "J\020\211+\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002" +
      "\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          SceneGalleryInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneGalleryInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryInfoNotify_descriptor,
        new java.lang.String[] { "GalleryInfo", });
    SceneGalleryInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
