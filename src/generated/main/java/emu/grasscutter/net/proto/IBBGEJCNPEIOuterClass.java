// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IBBGEJCNPEI.proto

public final class IBBGEJCNPEIOuterClass {
  private IBBGEJCNPEIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IBBGEJCNPEIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IBBGEJCNPEI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string flopankfnol = 1;</code>
     * @return The flopankfnol.
     */
    java.lang.String getFlopankfnol();
    /**
     * <code>string flopankfnol = 1;</code>
     * @return The bytes for flopankfnol.
     */
    com.google.protobuf.ByteString
        getFlopankfnolBytes();

    /**
     * <code>string gameBiz = 2;</code>
     * @return The gameBiz.
     */
    java.lang.String getGameBiz();
    /**
     * <code>string gameBiz = 2;</code>
     * @return The bytes for gameBiz.
     */
    com.google.protobuf.ByteString
        getGameBizBytes();

    /**
     * <code>string mnlpmamhoem = 3;</code>
     * @return The mnlpmamhoem.
     */
    java.lang.String getMnlpmamhoem();
    /**
     * <code>string mnlpmamhoem = 3;</code>
     * @return The bytes for mnlpmamhoem.
     */
    com.google.protobuf.ByteString
        getMnlpmamhoemBytes();
  }
  /**
   * Protobuf type {@code IBBGEJCNPEI}
   */
  public static final class IBBGEJCNPEI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IBBGEJCNPEI)
      IBBGEJCNPEIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IBBGEJCNPEI.newBuilder() to construct.
    private IBBGEJCNPEI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IBBGEJCNPEI() {
      flopankfnol_ = "";
      gameBiz_ = "";
      mnlpmamhoem_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IBBGEJCNPEI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IBBGEJCNPEI(
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

              flopankfnol_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              gameBiz_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              mnlpmamhoem_ = s;
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
      return IBBGEJCNPEIOuterClass.internal_static_IBBGEJCNPEI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return IBBGEJCNPEIOuterClass.internal_static_IBBGEJCNPEI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              IBBGEJCNPEIOuterClass.IBBGEJCNPEI.class, IBBGEJCNPEIOuterClass.IBBGEJCNPEI.Builder.class);
    }

    public static final int FLOPANKFNOL_FIELD_NUMBER = 1;
    private volatile java.lang.Object flopankfnol_;
    /**
     * <code>string flopankfnol = 1;</code>
     * @return The flopankfnol.
     */
    @java.lang.Override
    public java.lang.String getFlopankfnol() {
      java.lang.Object ref = flopankfnol_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        flopankfnol_ = s;
        return s;
      }
    }
    /**
     * <code>string flopankfnol = 1;</code>
     * @return The bytes for flopankfnol.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFlopankfnolBytes() {
      java.lang.Object ref = flopankfnol_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        flopankfnol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GAMEBIZ_FIELD_NUMBER = 2;
    private volatile java.lang.Object gameBiz_;
    /**
     * <code>string gameBiz = 2;</code>
     * @return The gameBiz.
     */
    @java.lang.Override
    public java.lang.String getGameBiz() {
      java.lang.Object ref = gameBiz_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gameBiz_ = s;
        return s;
      }
    }
    /**
     * <code>string gameBiz = 2;</code>
     * @return The bytes for gameBiz.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGameBizBytes() {
      java.lang.Object ref = gameBiz_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gameBiz_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MNLPMAMHOEM_FIELD_NUMBER = 3;
    private volatile java.lang.Object mnlpmamhoem_;
    /**
     * <code>string mnlpmamhoem = 3;</code>
     * @return The mnlpmamhoem.
     */
    @java.lang.Override
    public java.lang.String getMnlpmamhoem() {
      java.lang.Object ref = mnlpmamhoem_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mnlpmamhoem_ = s;
        return s;
      }
    }
    /**
     * <code>string mnlpmamhoem = 3;</code>
     * @return The bytes for mnlpmamhoem.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMnlpmamhoemBytes() {
      java.lang.Object ref = mnlpmamhoem_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mnlpmamhoem_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(flopankfnol_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, flopankfnol_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gameBiz_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gameBiz_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mnlpmamhoem_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mnlpmamhoem_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(flopankfnol_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, flopankfnol_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gameBiz_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gameBiz_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mnlpmamhoem_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mnlpmamhoem_);
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
      if (!(obj instanceof IBBGEJCNPEIOuterClass.IBBGEJCNPEI)) {
        return super.equals(obj);
      }
      IBBGEJCNPEIOuterClass.IBBGEJCNPEI other = (IBBGEJCNPEIOuterClass.IBBGEJCNPEI) obj;

      if (!getFlopankfnol()
          .equals(other.getFlopankfnol())) return false;
      if (!getGameBiz()
          .equals(other.getGameBiz())) return false;
      if (!getMnlpmamhoem()
          .equals(other.getMnlpmamhoem())) return false;
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
      hash = (37 * hash) + FLOPANKFNOL_FIELD_NUMBER;
      hash = (53 * hash) + getFlopankfnol().hashCode();
      hash = (37 * hash) + GAMEBIZ_FIELD_NUMBER;
      hash = (53 * hash) + getGameBiz().hashCode();
      hash = (37 * hash) + MNLPMAMHOEM_FIELD_NUMBER;
      hash = (53 * hash) + getMnlpmamhoem().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static IBBGEJCNPEIOuterClass.IBBGEJCNPEI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IBBGEJCNPEIOuterClass.IBBGEJCNPEI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IBBGEJCNPEIOuterClass.IBBGEJCNPEI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IBBGEJCNPEIOuterClass.IBBGEJCNPEI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IBBGEJCNPEIOuterClass.IBBGEJCNPEI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IBBGEJCNPEIOuterClass.IBBGEJCNPEI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IBBGEJCNPEIOuterClass.IBBGEJCNPEI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static IBBGEJCNPEIOuterClass.IBBGEJCNPEI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static IBBGEJCNPEIOuterClass.IBBGEJCNPEI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static IBBGEJCNPEIOuterClass.IBBGEJCNPEI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static IBBGEJCNPEIOuterClass.IBBGEJCNPEI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static IBBGEJCNPEIOuterClass.IBBGEJCNPEI parseFrom(
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
    public static Builder newBuilder(IBBGEJCNPEIOuterClass.IBBGEJCNPEI prototype) {
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
     * Protobuf type {@code IBBGEJCNPEI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IBBGEJCNPEI)
        IBBGEJCNPEIOuterClass.IBBGEJCNPEIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return IBBGEJCNPEIOuterClass.internal_static_IBBGEJCNPEI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return IBBGEJCNPEIOuterClass.internal_static_IBBGEJCNPEI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                IBBGEJCNPEIOuterClass.IBBGEJCNPEI.class, IBBGEJCNPEIOuterClass.IBBGEJCNPEI.Builder.class);
      }

      // Construct using IBBGEJCNPEIOuterClass.IBBGEJCNPEI.newBuilder()
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
        flopankfnol_ = "";

        gameBiz_ = "";

        mnlpmamhoem_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return IBBGEJCNPEIOuterClass.internal_static_IBBGEJCNPEI_descriptor;
      }

      @java.lang.Override
      public IBBGEJCNPEIOuterClass.IBBGEJCNPEI getDefaultInstanceForType() {
        return IBBGEJCNPEIOuterClass.IBBGEJCNPEI.getDefaultInstance();
      }

      @java.lang.Override
      public IBBGEJCNPEIOuterClass.IBBGEJCNPEI build() {
        IBBGEJCNPEIOuterClass.IBBGEJCNPEI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public IBBGEJCNPEIOuterClass.IBBGEJCNPEI buildPartial() {
        IBBGEJCNPEIOuterClass.IBBGEJCNPEI result = new IBBGEJCNPEIOuterClass.IBBGEJCNPEI(this);
        result.flopankfnol_ = flopankfnol_;
        result.gameBiz_ = gameBiz_;
        result.mnlpmamhoem_ = mnlpmamhoem_;
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
        if (other instanceof IBBGEJCNPEIOuterClass.IBBGEJCNPEI) {
          return mergeFrom((IBBGEJCNPEIOuterClass.IBBGEJCNPEI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(IBBGEJCNPEIOuterClass.IBBGEJCNPEI other) {
        if (other == IBBGEJCNPEIOuterClass.IBBGEJCNPEI.getDefaultInstance()) return this;
        if (!other.getFlopankfnol().isEmpty()) {
          flopankfnol_ = other.flopankfnol_;
          onChanged();
        }
        if (!other.getGameBiz().isEmpty()) {
          gameBiz_ = other.gameBiz_;
          onChanged();
        }
        if (!other.getMnlpmamhoem().isEmpty()) {
          mnlpmamhoem_ = other.mnlpmamhoem_;
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
        IBBGEJCNPEIOuterClass.IBBGEJCNPEI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (IBBGEJCNPEIOuterClass.IBBGEJCNPEI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object flopankfnol_ = "";
      /**
       * <code>string flopankfnol = 1;</code>
       * @return The flopankfnol.
       */
      public java.lang.String getFlopankfnol() {
        java.lang.Object ref = flopankfnol_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          flopankfnol_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string flopankfnol = 1;</code>
       * @return The bytes for flopankfnol.
       */
      public com.google.protobuf.ByteString
          getFlopankfnolBytes() {
        java.lang.Object ref = flopankfnol_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          flopankfnol_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string flopankfnol = 1;</code>
       * @param value The flopankfnol to set.
       * @return This builder for chaining.
       */
      public Builder setFlopankfnol(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        flopankfnol_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string flopankfnol = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFlopankfnol() {
        
        flopankfnol_ = getDefaultInstance().getFlopankfnol();
        onChanged();
        return this;
      }
      /**
       * <code>string flopankfnol = 1;</code>
       * @param value The bytes for flopankfnol to set.
       * @return This builder for chaining.
       */
      public Builder setFlopankfnolBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        flopankfnol_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object gameBiz_ = "";
      /**
       * <code>string gameBiz = 2;</code>
       * @return The gameBiz.
       */
      public java.lang.String getGameBiz() {
        java.lang.Object ref = gameBiz_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          gameBiz_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string gameBiz = 2;</code>
       * @return The bytes for gameBiz.
       */
      public com.google.protobuf.ByteString
          getGameBizBytes() {
        java.lang.Object ref = gameBiz_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          gameBiz_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string gameBiz = 2;</code>
       * @param value The gameBiz to set.
       * @return This builder for chaining.
       */
      public Builder setGameBiz(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        gameBiz_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string gameBiz = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGameBiz() {
        
        gameBiz_ = getDefaultInstance().getGameBiz();
        onChanged();
        return this;
      }
      /**
       * <code>string gameBiz = 2;</code>
       * @param value The bytes for gameBiz to set.
       * @return This builder for chaining.
       */
      public Builder setGameBizBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        gameBiz_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object mnlpmamhoem_ = "";
      /**
       * <code>string mnlpmamhoem = 3;</code>
       * @return The mnlpmamhoem.
       */
      public java.lang.String getMnlpmamhoem() {
        java.lang.Object ref = mnlpmamhoem_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          mnlpmamhoem_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string mnlpmamhoem = 3;</code>
       * @return The bytes for mnlpmamhoem.
       */
      public com.google.protobuf.ByteString
          getMnlpmamhoemBytes() {
        java.lang.Object ref = mnlpmamhoem_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mnlpmamhoem_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string mnlpmamhoem = 3;</code>
       * @param value The mnlpmamhoem to set.
       * @return This builder for chaining.
       */
      public Builder setMnlpmamhoem(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        mnlpmamhoem_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string mnlpmamhoem = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMnlpmamhoem() {
        
        mnlpmamhoem_ = getDefaultInstance().getMnlpmamhoem();
        onChanged();
        return this;
      }
      /**
       * <code>string mnlpmamhoem = 3;</code>
       * @param value The bytes for mnlpmamhoem to set.
       * @return This builder for chaining.
       */
      public Builder setMnlpmamhoemBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        mnlpmamhoem_ = value;
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


      // @@protoc_insertion_point(builder_scope:IBBGEJCNPEI)
    }

    // @@protoc_insertion_point(class_scope:IBBGEJCNPEI)
    private static final IBBGEJCNPEIOuterClass.IBBGEJCNPEI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new IBBGEJCNPEIOuterClass.IBBGEJCNPEI();
    }

    public static IBBGEJCNPEIOuterClass.IBBGEJCNPEI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IBBGEJCNPEI>
        PARSER = new com.google.protobuf.AbstractParser<IBBGEJCNPEI>() {
      @java.lang.Override
      public IBBGEJCNPEI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IBBGEJCNPEI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IBBGEJCNPEI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IBBGEJCNPEI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public IBBGEJCNPEIOuterClass.IBBGEJCNPEI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IBBGEJCNPEI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IBBGEJCNPEI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021IBBGEJCNPEI.proto\"H\n\013IBBGEJCNPEI\022\023\n\013fl" +
      "opankfnol\030\001 \001(\t\022\017\n\007gameBiz\030\002 \001(\t\022\023\n\013mnlp" +
      "mamhoem\030\003 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IBBGEJCNPEI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IBBGEJCNPEI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IBBGEJCNPEI_descriptor,
        new java.lang.String[] { "Flopankfnol", "GameBiz", "Mnlpmamhoem", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
