// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HGHPBLJEAJJ.proto

public final class HGHPBLJEAJJOuterClass {
  private HGHPBLJEAJJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HGHPBLJEAJJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HGHPBLJEAJJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string createTime = 1;</code>
     * @return The createTime.
     */
    java.lang.String getCreateTime();
    /**
     * <code>string createTime = 1;</code>
     * @return The bytes for createTime.
     */
    com.google.protobuf.ByteString
        getCreateTimeBytes();

    /**
     * <code>string title = 2;</code>
     * @return The title.
     */
    java.lang.String getTitle();
    /**
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    com.google.protobuf.ByteString
        getTitleBytes();

    /**
     * <code>string type = 3;</code>
     * @return The type.
     */
    java.lang.String getType();
    /**
     * <code>string type = 3;</code>
     * @return The bytes for type.
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <code>string jmggbhlelnm = 4;</code>
     * @return The jmggbhlelnm.
     */
    java.lang.String getJmggbhlelnm();
    /**
     * <code>string jmggbhlelnm = 4;</code>
     * @return The bytes for jmggbhlelnm.
     */
    com.google.protobuf.ByteString
        getJmggbhlelnmBytes();
  }
  /**
   * Protobuf type {@code HGHPBLJEAJJ}
   */
  public static final class HGHPBLJEAJJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HGHPBLJEAJJ)
      HGHPBLJEAJJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HGHPBLJEAJJ.newBuilder() to construct.
    private HGHPBLJEAJJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HGHPBLJEAJJ() {
      createTime_ = "";
      title_ = "";
      type_ = "";
      jmggbhlelnm_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HGHPBLJEAJJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HGHPBLJEAJJ(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              createTime_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              title_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              type_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              jmggbhlelnm_ = s;
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
      return HGHPBLJEAJJOuterClass.internal_static_HGHPBLJEAJJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HGHPBLJEAJJOuterClass.internal_static_HGHPBLJEAJJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HGHPBLJEAJJOuterClass.HGHPBLJEAJJ.class, HGHPBLJEAJJOuterClass.HGHPBLJEAJJ.Builder.class);
    }

    public static final int CREATETIME_FIELD_NUMBER = 1;
    private volatile java.lang.Object createTime_;
    /**
     * <code>string createTime = 1;</code>
     * @return The createTime.
     */
    @java.lang.Override
    public java.lang.String getCreateTime() {
      java.lang.Object ref = createTime_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createTime_ = s;
        return s;
      }
    }
    /**
     * <code>string createTime = 1;</code>
     * @return The bytes for createTime.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCreateTimeBytes() {
      java.lang.Object ref = createTime_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TITLE_FIELD_NUMBER = 2;
    private volatile java.lang.Object title_;
    /**
     * <code>string title = 2;</code>
     * @return The title.
     */
    @java.lang.Override
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private volatile java.lang.Object type_;
    /**
     * <code>string type = 3;</code>
     * @return The type.
     */
    @java.lang.Override
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      }
    }
    /**
     * <code>string type = 3;</code>
     * @return The bytes for type.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int JMGGBHLELNM_FIELD_NUMBER = 4;
    private volatile java.lang.Object jmggbhlelnm_;
    /**
     * <code>string jmggbhlelnm = 4;</code>
     * @return The jmggbhlelnm.
     */
    @java.lang.Override
    public java.lang.String getJmggbhlelnm() {
      java.lang.Object ref = jmggbhlelnm_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jmggbhlelnm_ = s;
        return s;
      }
    }
    /**
     * <code>string jmggbhlelnm = 4;</code>
     * @return The bytes for jmggbhlelnm.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getJmggbhlelnmBytes() {
      java.lang.Object ref = jmggbhlelnm_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jmggbhlelnm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(createTime_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, createTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jmggbhlelnm_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, jmggbhlelnm_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(createTime_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, createTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jmggbhlelnm_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, jmggbhlelnm_);
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
      if (!(obj instanceof HGHPBLJEAJJOuterClass.HGHPBLJEAJJ)) {
        return super.equals(obj);
      }
      HGHPBLJEAJJOuterClass.HGHPBLJEAJJ other = (HGHPBLJEAJJOuterClass.HGHPBLJEAJJ) obj;

      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
      if (!getTitle()
          .equals(other.getTitle())) return false;
      if (!getType()
          .equals(other.getType())) return false;
      if (!getJmggbhlelnm()
          .equals(other.getJmggbhlelnm())) return false;
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
      hash = (37 * hash) + CREATETIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
      hash = (37 * hash) + TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getTitle().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
      hash = (37 * hash) + JMGGBHLELNM_FIELD_NUMBER;
      hash = (53 * hash) + getJmggbhlelnm().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HGHPBLJEAJJOuterClass.HGHPBLJEAJJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HGHPBLJEAJJOuterClass.HGHPBLJEAJJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HGHPBLJEAJJOuterClass.HGHPBLJEAJJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HGHPBLJEAJJOuterClass.HGHPBLJEAJJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HGHPBLJEAJJOuterClass.HGHPBLJEAJJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HGHPBLJEAJJOuterClass.HGHPBLJEAJJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HGHPBLJEAJJOuterClass.HGHPBLJEAJJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HGHPBLJEAJJOuterClass.HGHPBLJEAJJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HGHPBLJEAJJOuterClass.HGHPBLJEAJJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HGHPBLJEAJJOuterClass.HGHPBLJEAJJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HGHPBLJEAJJOuterClass.HGHPBLJEAJJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HGHPBLJEAJJOuterClass.HGHPBLJEAJJ parseFrom(
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
    public static Builder newBuilder(HGHPBLJEAJJOuterClass.HGHPBLJEAJJ prototype) {
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
     * Protobuf type {@code HGHPBLJEAJJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HGHPBLJEAJJ)
        HGHPBLJEAJJOuterClass.HGHPBLJEAJJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HGHPBLJEAJJOuterClass.internal_static_HGHPBLJEAJJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HGHPBLJEAJJOuterClass.internal_static_HGHPBLJEAJJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HGHPBLJEAJJOuterClass.HGHPBLJEAJJ.class, HGHPBLJEAJJOuterClass.HGHPBLJEAJJ.Builder.class);
      }

      // Construct using HGHPBLJEAJJOuterClass.HGHPBLJEAJJ.newBuilder()
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
        createTime_ = "";

        title_ = "";

        type_ = "";

        jmggbhlelnm_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HGHPBLJEAJJOuterClass.internal_static_HGHPBLJEAJJ_descriptor;
      }

      @java.lang.Override
      public HGHPBLJEAJJOuterClass.HGHPBLJEAJJ getDefaultInstanceForType() {
        return HGHPBLJEAJJOuterClass.HGHPBLJEAJJ.getDefaultInstance();
      }

      @java.lang.Override
      public HGHPBLJEAJJOuterClass.HGHPBLJEAJJ build() {
        HGHPBLJEAJJOuterClass.HGHPBLJEAJJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HGHPBLJEAJJOuterClass.HGHPBLJEAJJ buildPartial() {
        HGHPBLJEAJJOuterClass.HGHPBLJEAJJ result = new HGHPBLJEAJJOuterClass.HGHPBLJEAJJ(this);
        result.createTime_ = createTime_;
        result.title_ = title_;
        result.type_ = type_;
        result.jmggbhlelnm_ = jmggbhlelnm_;
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
        if (other instanceof HGHPBLJEAJJOuterClass.HGHPBLJEAJJ) {
          return mergeFrom((HGHPBLJEAJJOuterClass.HGHPBLJEAJJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HGHPBLJEAJJOuterClass.HGHPBLJEAJJ other) {
        if (other == HGHPBLJEAJJOuterClass.HGHPBLJEAJJ.getDefaultInstance()) return this;
        if (!other.getCreateTime().isEmpty()) {
          createTime_ = other.createTime_;
          onChanged();
        }
        if (!other.getTitle().isEmpty()) {
          title_ = other.title_;
          onChanged();
        }
        if (!other.getType().isEmpty()) {
          type_ = other.type_;
          onChanged();
        }
        if (!other.getJmggbhlelnm().isEmpty()) {
          jmggbhlelnm_ = other.jmggbhlelnm_;
          onChanged();
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
        HGHPBLJEAJJOuterClass.HGHPBLJEAJJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HGHPBLJEAJJOuterClass.HGHPBLJEAJJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object createTime_ = "";
      /**
       * <code>string createTime = 1;</code>
       * @return The createTime.
       */
      public java.lang.String getCreateTime() {
        java.lang.Object ref = createTime_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          createTime_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string createTime = 1;</code>
       * @return The bytes for createTime.
       */
      public com.google.protobuf.ByteString
          getCreateTimeBytes() {
        java.lang.Object ref = createTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          createTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string createTime = 1;</code>
       * @param value The createTime to set.
       * @return This builder for chaining.
       */
      public Builder setCreateTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        createTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string createTime = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCreateTime() {
        
        createTime_ = getDefaultInstance().getCreateTime();
        onChanged();
        return this;
      }
      /**
       * <code>string createTime = 1;</code>
       * @param value The bytes for createTime to set.
       * @return This builder for chaining.
       */
      public Builder setCreateTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        createTime_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object title_ = "";
      /**
       * <code>string title = 2;</code>
       * @return The title.
       */
      public java.lang.String getTitle() {
        java.lang.Object ref = title_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          title_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string title = 2;</code>
       * @return The bytes for title.
       */
      public com.google.protobuf.ByteString
          getTitleBytes() {
        java.lang.Object ref = title_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          title_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string title = 2;</code>
       * @param value The title to set.
       * @return This builder for chaining.
       */
      public Builder setTitle(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        title_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string title = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTitle() {
        
        title_ = getDefaultInstance().getTitle();
        onChanged();
        return this;
      }
      /**
       * <code>string title = 2;</code>
       * @param value The bytes for title to set.
       * @return This builder for chaining.
       */
      public Builder setTitleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        title_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object type_ = "";
      /**
       * <code>string type = 3;</code>
       * @return The type.
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string type = 3;</code>
       * @return The bytes for type.
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string type = 3;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <code>string type = 3;</code>
       * @param value The bytes for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        type_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object jmggbhlelnm_ = "";
      /**
       * <code>string jmggbhlelnm = 4;</code>
       * @return The jmggbhlelnm.
       */
      public java.lang.String getJmggbhlelnm() {
        java.lang.Object ref = jmggbhlelnm_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          jmggbhlelnm_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string jmggbhlelnm = 4;</code>
       * @return The bytes for jmggbhlelnm.
       */
      public com.google.protobuf.ByteString
          getJmggbhlelnmBytes() {
        java.lang.Object ref = jmggbhlelnm_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          jmggbhlelnm_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string jmggbhlelnm = 4;</code>
       * @param value The jmggbhlelnm to set.
       * @return This builder for chaining.
       */
      public Builder setJmggbhlelnm(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        jmggbhlelnm_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string jmggbhlelnm = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearJmggbhlelnm() {
        
        jmggbhlelnm_ = getDefaultInstance().getJmggbhlelnm();
        onChanged();
        return this;
      }
      /**
       * <code>string jmggbhlelnm = 4;</code>
       * @param value The bytes for jmggbhlelnm to set.
       * @return This builder for chaining.
       */
      public Builder setJmggbhlelnmBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        jmggbhlelnm_ = value;
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


      // @@protoc_insertion_point(builder_scope:HGHPBLJEAJJ)
    }

    // @@protoc_insertion_point(class_scope:HGHPBLJEAJJ)
    private static final HGHPBLJEAJJOuterClass.HGHPBLJEAJJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HGHPBLJEAJJOuterClass.HGHPBLJEAJJ();
    }

    public static HGHPBLJEAJJOuterClass.HGHPBLJEAJJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HGHPBLJEAJJ>
        PARSER = new com.google.protobuf.AbstractParser<HGHPBLJEAJJ>() {
      @java.lang.Override
      public HGHPBLJEAJJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HGHPBLJEAJJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HGHPBLJEAJJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HGHPBLJEAJJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HGHPBLJEAJJOuterClass.HGHPBLJEAJJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HGHPBLJEAJJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HGHPBLJEAJJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HGHPBLJEAJJ.proto\"S\n\013HGHPBLJEAJJ\022\022\n\ncr" +
      "eateTime\030\001 \001(\t\022\r\n\005title\030\002 \001(\t\022\014\n\004type\030\003 " +
      "\001(\t\022\023\n\013jmggbhlelnm\030\004 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HGHPBLJEAJJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HGHPBLJEAJJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HGHPBLJEAJJ_descriptor,
        new java.lang.String[] { "CreateTime", "Title", "Type", "Jmggbhlelnm", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
