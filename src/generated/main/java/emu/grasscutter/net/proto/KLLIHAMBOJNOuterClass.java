// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KLLIHAMBOJN.proto

public final class KLLIHAMBOJNOuterClass {
  private KLLIHAMBOJNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KLLIHAMBOJNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KLLIHAMBOJN)
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
     * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
     * @return Whether the jkfdibhoggm field is set.
     */
    boolean hasJkfdibhoggm();
    /**
     * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
     * @return The jkfdibhoggm.
     */
    FJMGEBIAMDBOuterClass.FJMGEBIAMDB getJkfdibhoggm();
    /**
     * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
     */
    FJMGEBIAMDBOuterClass.FJMGEBIAMDBOrBuilder getJkfdibhoggmOrBuilder();
  }
  /**
   * Protobuf type {@code KLLIHAMBOJN}
   */
  public static final class KLLIHAMBOJN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KLLIHAMBOJN)
      KLLIHAMBOJNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KLLIHAMBOJN.newBuilder() to construct.
    private KLLIHAMBOJN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KLLIHAMBOJN() {
      createTime_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KLLIHAMBOJN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KLLIHAMBOJN(
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
              FJMGEBIAMDBOuterClass.FJMGEBIAMDB.Builder subBuilder = null;
              if (jkfdibhoggm_ != null) {
                subBuilder = jkfdibhoggm_.toBuilder();
              }
              jkfdibhoggm_ = input.readMessage(FJMGEBIAMDBOuterClass.FJMGEBIAMDB.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(jkfdibhoggm_);
                jkfdibhoggm_ = subBuilder.buildPartial();
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
      return KLLIHAMBOJNOuterClass.internal_static_KLLIHAMBOJN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return KLLIHAMBOJNOuterClass.internal_static_KLLIHAMBOJN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              KLLIHAMBOJNOuterClass.KLLIHAMBOJN.class, KLLIHAMBOJNOuterClass.KLLIHAMBOJN.Builder.class);
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

    public static final int JKFDIBHOGGM_FIELD_NUMBER = 2;
    private FJMGEBIAMDBOuterClass.FJMGEBIAMDB jkfdibhoggm_;
    /**
     * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
     * @return Whether the jkfdibhoggm field is set.
     */
    @java.lang.Override
    public boolean hasJkfdibhoggm() {
      return jkfdibhoggm_ != null;
    }
    /**
     * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
     * @return The jkfdibhoggm.
     */
    @java.lang.Override
    public FJMGEBIAMDBOuterClass.FJMGEBIAMDB getJkfdibhoggm() {
      return jkfdibhoggm_ == null ? FJMGEBIAMDBOuterClass.FJMGEBIAMDB.getDefaultInstance() : jkfdibhoggm_;
    }
    /**
     * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
     */
    @java.lang.Override
    public FJMGEBIAMDBOuterClass.FJMGEBIAMDBOrBuilder getJkfdibhoggmOrBuilder() {
      return getJkfdibhoggm();
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
      if (jkfdibhoggm_ != null) {
        output.writeMessage(2, getJkfdibhoggm());
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
      if (jkfdibhoggm_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getJkfdibhoggm());
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
      if (!(obj instanceof KLLIHAMBOJNOuterClass.KLLIHAMBOJN)) {
        return super.equals(obj);
      }
      KLLIHAMBOJNOuterClass.KLLIHAMBOJN other = (KLLIHAMBOJNOuterClass.KLLIHAMBOJN) obj;

      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
      if (hasJkfdibhoggm() != other.hasJkfdibhoggm()) return false;
      if (hasJkfdibhoggm()) {
        if (!getJkfdibhoggm()
            .equals(other.getJkfdibhoggm())) return false;
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
      hash = (37 * hash) + CREATETIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
      if (hasJkfdibhoggm()) {
        hash = (37 * hash) + JKFDIBHOGGM_FIELD_NUMBER;
        hash = (53 * hash) + getJkfdibhoggm().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static KLLIHAMBOJNOuterClass.KLLIHAMBOJN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static KLLIHAMBOJNOuterClass.KLLIHAMBOJN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static KLLIHAMBOJNOuterClass.KLLIHAMBOJN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static KLLIHAMBOJNOuterClass.KLLIHAMBOJN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static KLLIHAMBOJNOuterClass.KLLIHAMBOJN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static KLLIHAMBOJNOuterClass.KLLIHAMBOJN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static KLLIHAMBOJNOuterClass.KLLIHAMBOJN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static KLLIHAMBOJNOuterClass.KLLIHAMBOJN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static KLLIHAMBOJNOuterClass.KLLIHAMBOJN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static KLLIHAMBOJNOuterClass.KLLIHAMBOJN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static KLLIHAMBOJNOuterClass.KLLIHAMBOJN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static KLLIHAMBOJNOuterClass.KLLIHAMBOJN parseFrom(
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
    public static Builder newBuilder(KLLIHAMBOJNOuterClass.KLLIHAMBOJN prototype) {
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
     * Protobuf type {@code KLLIHAMBOJN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KLLIHAMBOJN)
        KLLIHAMBOJNOuterClass.KLLIHAMBOJNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return KLLIHAMBOJNOuterClass.internal_static_KLLIHAMBOJN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return KLLIHAMBOJNOuterClass.internal_static_KLLIHAMBOJN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                KLLIHAMBOJNOuterClass.KLLIHAMBOJN.class, KLLIHAMBOJNOuterClass.KLLIHAMBOJN.Builder.class);
      }

      // Construct using KLLIHAMBOJNOuterClass.KLLIHAMBOJN.newBuilder()
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

        if (jkfdibhoggmBuilder_ == null) {
          jkfdibhoggm_ = null;
        } else {
          jkfdibhoggm_ = null;
          jkfdibhoggmBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return KLLIHAMBOJNOuterClass.internal_static_KLLIHAMBOJN_descriptor;
      }

      @java.lang.Override
      public KLLIHAMBOJNOuterClass.KLLIHAMBOJN getDefaultInstanceForType() {
        return KLLIHAMBOJNOuterClass.KLLIHAMBOJN.getDefaultInstance();
      }

      @java.lang.Override
      public KLLIHAMBOJNOuterClass.KLLIHAMBOJN build() {
        KLLIHAMBOJNOuterClass.KLLIHAMBOJN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public KLLIHAMBOJNOuterClass.KLLIHAMBOJN buildPartial() {
        KLLIHAMBOJNOuterClass.KLLIHAMBOJN result = new KLLIHAMBOJNOuterClass.KLLIHAMBOJN(this);
        result.createTime_ = createTime_;
        if (jkfdibhoggmBuilder_ == null) {
          result.jkfdibhoggm_ = jkfdibhoggm_;
        } else {
          result.jkfdibhoggm_ = jkfdibhoggmBuilder_.build();
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
        if (other instanceof KLLIHAMBOJNOuterClass.KLLIHAMBOJN) {
          return mergeFrom((KLLIHAMBOJNOuterClass.KLLIHAMBOJN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(KLLIHAMBOJNOuterClass.KLLIHAMBOJN other) {
        if (other == KLLIHAMBOJNOuterClass.KLLIHAMBOJN.getDefaultInstance()) return this;
        if (!other.getCreateTime().isEmpty()) {
          createTime_ = other.createTime_;
          onChanged();
        }
        if (other.hasJkfdibhoggm()) {
          mergeJkfdibhoggm(other.getJkfdibhoggm());
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
        KLLIHAMBOJNOuterClass.KLLIHAMBOJN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (KLLIHAMBOJNOuterClass.KLLIHAMBOJN) e.getUnfinishedMessage();
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

      private FJMGEBIAMDBOuterClass.FJMGEBIAMDB jkfdibhoggm_;
      private com.google.protobuf.SingleFieldBuilderV3<
          FJMGEBIAMDBOuterClass.FJMGEBIAMDB, FJMGEBIAMDBOuterClass.FJMGEBIAMDB.Builder, FJMGEBIAMDBOuterClass.FJMGEBIAMDBOrBuilder> jkfdibhoggmBuilder_;
      /**
       * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
       * @return Whether the jkfdibhoggm field is set.
       */
      public boolean hasJkfdibhoggm() {
        return jkfdibhoggmBuilder_ != null || jkfdibhoggm_ != null;
      }
      /**
       * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
       * @return The jkfdibhoggm.
       */
      public FJMGEBIAMDBOuterClass.FJMGEBIAMDB getJkfdibhoggm() {
        if (jkfdibhoggmBuilder_ == null) {
          return jkfdibhoggm_ == null ? FJMGEBIAMDBOuterClass.FJMGEBIAMDB.getDefaultInstance() : jkfdibhoggm_;
        } else {
          return jkfdibhoggmBuilder_.getMessage();
        }
      }
      /**
       * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
       */
      public Builder setJkfdibhoggm(FJMGEBIAMDBOuterClass.FJMGEBIAMDB value) {
        if (jkfdibhoggmBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          jkfdibhoggm_ = value;
          onChanged();
        } else {
          jkfdibhoggmBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
       */
      public Builder setJkfdibhoggm(
          FJMGEBIAMDBOuterClass.FJMGEBIAMDB.Builder builderForValue) {
        if (jkfdibhoggmBuilder_ == null) {
          jkfdibhoggm_ = builderForValue.build();
          onChanged();
        } else {
          jkfdibhoggmBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
       */
      public Builder mergeJkfdibhoggm(FJMGEBIAMDBOuterClass.FJMGEBIAMDB value) {
        if (jkfdibhoggmBuilder_ == null) {
          if (jkfdibhoggm_ != null) {
            jkfdibhoggm_ =
              FJMGEBIAMDBOuterClass.FJMGEBIAMDB.newBuilder(jkfdibhoggm_).mergeFrom(value).buildPartial();
          } else {
            jkfdibhoggm_ = value;
          }
          onChanged();
        } else {
          jkfdibhoggmBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
       */
      public Builder clearJkfdibhoggm() {
        if (jkfdibhoggmBuilder_ == null) {
          jkfdibhoggm_ = null;
          onChanged();
        } else {
          jkfdibhoggm_ = null;
          jkfdibhoggmBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
       */
      public FJMGEBIAMDBOuterClass.FJMGEBIAMDB.Builder getJkfdibhoggmBuilder() {
        
        onChanged();
        return getJkfdibhoggmFieldBuilder().getBuilder();
      }
      /**
       * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
       */
      public FJMGEBIAMDBOuterClass.FJMGEBIAMDBOrBuilder getJkfdibhoggmOrBuilder() {
        if (jkfdibhoggmBuilder_ != null) {
          return jkfdibhoggmBuilder_.getMessageOrBuilder();
        } else {
          return jkfdibhoggm_ == null ?
              FJMGEBIAMDBOuterClass.FJMGEBIAMDB.getDefaultInstance() : jkfdibhoggm_;
        }
      }
      /**
       * <code>.FJMGEBIAMDB jkfdibhoggm = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          FJMGEBIAMDBOuterClass.FJMGEBIAMDB, FJMGEBIAMDBOuterClass.FJMGEBIAMDB.Builder, FJMGEBIAMDBOuterClass.FJMGEBIAMDBOrBuilder> 
          getJkfdibhoggmFieldBuilder() {
        if (jkfdibhoggmBuilder_ == null) {
          jkfdibhoggmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              FJMGEBIAMDBOuterClass.FJMGEBIAMDB, FJMGEBIAMDBOuterClass.FJMGEBIAMDB.Builder, FJMGEBIAMDBOuterClass.FJMGEBIAMDBOrBuilder>(
                  getJkfdibhoggm(),
                  getParentForChildren(),
                  isClean());
          jkfdibhoggm_ = null;
        }
        return jkfdibhoggmBuilder_;
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


      // @@protoc_insertion_point(builder_scope:KLLIHAMBOJN)
    }

    // @@protoc_insertion_point(class_scope:KLLIHAMBOJN)
    private static final KLLIHAMBOJNOuterClass.KLLIHAMBOJN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new KLLIHAMBOJNOuterClass.KLLIHAMBOJN();
    }

    public static KLLIHAMBOJNOuterClass.KLLIHAMBOJN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KLLIHAMBOJN>
        PARSER = new com.google.protobuf.AbstractParser<KLLIHAMBOJN>() {
      @java.lang.Override
      public KLLIHAMBOJN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KLLIHAMBOJN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KLLIHAMBOJN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KLLIHAMBOJN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public KLLIHAMBOJNOuterClass.KLLIHAMBOJN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KLLIHAMBOJN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KLLIHAMBOJN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KLLIHAMBOJN.proto\032\021FJMGEBIAMDB.proto\"D" +
      "\n\013KLLIHAMBOJN\022\022\n\ncreateTime\030\001 \001(\t\022!\n\013jkf" +
      "dibhoggm\030\002 \001(\0132\014.FJMGEBIAMDBb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          FJMGEBIAMDBOuterClass.getDescriptor(),
        });
    internal_static_KLLIHAMBOJN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KLLIHAMBOJN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KLLIHAMBOJN_descriptor,
        new java.lang.String[] { "CreateTime", "Jkfdibhoggm", });
    FJMGEBIAMDBOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
