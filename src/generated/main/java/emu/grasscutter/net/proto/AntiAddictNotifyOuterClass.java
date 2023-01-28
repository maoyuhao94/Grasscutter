// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AntiAddictNotify.proto

public final class AntiAddictNotifyOuterClass {
  private AntiAddictNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AntiAddictNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AntiAddictNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string msg = 3;</code>
     * @return The msg.
     */
    java.lang.String getMsg();
    /**
     * <code>string msg = 3;</code>
     * @return The bytes for msg.
     */
    com.google.protobuf.ByteString
        getMsgBytes();

    /**
     * <code>string level = 14;</code>
     * @return The level.
     */
    java.lang.String getLevel();
    /**
     * <code>string level = 14;</code>
     * @return The bytes for level.
     */
    com.google.protobuf.ByteString
        getLevelBytes();

    /**
     * <code>int32 msgType = 13;</code>
     * @return The msgType.
     */
    int getMsgType();
  }
  /**
   * Protobuf type {@code AntiAddictNotify}
   */
  public static final class AntiAddictNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AntiAddictNotify)
      AntiAddictNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AntiAddictNotify.newBuilder() to construct.
    private AntiAddictNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AntiAddictNotify() {
      msg_ = "";
      level_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AntiAddictNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AntiAddictNotify(
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
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              msg_ = s;
              break;
            }
            case 104: {

              msgType_ = input.readInt32();
              break;
            }
            case 114: {
              java.lang.String s = input.readStringRequireUtf8();

              level_ = s;
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
      return AntiAddictNotifyOuterClass.internal_static_AntiAddictNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AntiAddictNotifyOuterClass.internal_static_AntiAddictNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AntiAddictNotifyOuterClass.AntiAddictNotify.class, AntiAddictNotifyOuterClass.AntiAddictNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code AntiAddictNotify.GCFCHEHELNP}
     */
    public enum GCFCHEHELNP
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 104;</code>
       */
      PEPPOHPHJOJ(1, 104),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final GCFCHEHELNP DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 104;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 104;
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
      public static GCFCHEHELNP valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static GCFCHEHELNP forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 104: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<GCFCHEHELNP>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          GCFCHEHELNP> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<GCFCHEHELNP>() {
              public GCFCHEHELNP findValueByNumber(int number) {
                return GCFCHEHELNP.forNumber(number);
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
        return AntiAddictNotifyOuterClass.AntiAddictNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final GCFCHEHELNP[] VALUES = getStaticValuesArray();
      private static GCFCHEHELNP[] getStaticValuesArray() {
        return new GCFCHEHELNP[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static GCFCHEHELNP valueOf(
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

      private GCFCHEHELNP(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:AntiAddictNotify.GCFCHEHELNP)
    }

    public static final int MSG_FIELD_NUMBER = 3;
    private volatile java.lang.Object msg_;
    /**
     * <code>string msg = 3;</code>
     * @return The msg.
     */
    @java.lang.Override
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      }
    }
    /**
     * <code>string msg = 3;</code>
     * @return The bytes for msg.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LEVEL_FIELD_NUMBER = 14;
    private volatile java.lang.Object level_;
    /**
     * <code>string level = 14;</code>
     * @return The level.
     */
    @java.lang.Override
    public java.lang.String getLevel() {
      java.lang.Object ref = level_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        level_ = s;
        return s;
      }
    }
    /**
     * <code>string level = 14;</code>
     * @return The bytes for level.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLevelBytes() {
      java.lang.Object ref = level_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        level_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MSGTYPE_FIELD_NUMBER = 13;
    private int msgType_;
    /**
     * <code>int32 msgType = 13;</code>
     * @return The msgType.
     */
    @java.lang.Override
    public int getMsgType() {
      return msgType_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msg_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, msg_);
      }
      if (msgType_ != 0) {
        output.writeInt32(13, msgType_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(level_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, level_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msg_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, msg_);
      }
      if (msgType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, msgType_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(level_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, level_);
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
      if (!(obj instanceof AntiAddictNotifyOuterClass.AntiAddictNotify)) {
        return super.equals(obj);
      }
      AntiAddictNotifyOuterClass.AntiAddictNotify other = (AntiAddictNotifyOuterClass.AntiAddictNotify) obj;

      if (!getMsg()
          .equals(other.getMsg())) return false;
      if (!getLevel()
          .equals(other.getLevel())) return false;
      if (getMsgType()
          != other.getMsgType()) return false;
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
      hash = (37 * hash) + MSG_FIELD_NUMBER;
      hash = (53 * hash) + getMsg().hashCode();
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel().hashCode();
      hash = (37 * hash) + MSGTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getMsgType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AntiAddictNotifyOuterClass.AntiAddictNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AntiAddictNotifyOuterClass.AntiAddictNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AntiAddictNotifyOuterClass.AntiAddictNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AntiAddictNotifyOuterClass.AntiAddictNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AntiAddictNotifyOuterClass.AntiAddictNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AntiAddictNotifyOuterClass.AntiAddictNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AntiAddictNotifyOuterClass.AntiAddictNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AntiAddictNotifyOuterClass.AntiAddictNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static AntiAddictNotifyOuterClass.AntiAddictNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static AntiAddictNotifyOuterClass.AntiAddictNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AntiAddictNotifyOuterClass.AntiAddictNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AntiAddictNotifyOuterClass.AntiAddictNotify parseFrom(
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
    public static Builder newBuilder(AntiAddictNotifyOuterClass.AntiAddictNotify prototype) {
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
     * Protobuf type {@code AntiAddictNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AntiAddictNotify)
        AntiAddictNotifyOuterClass.AntiAddictNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AntiAddictNotifyOuterClass.internal_static_AntiAddictNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AntiAddictNotifyOuterClass.internal_static_AntiAddictNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AntiAddictNotifyOuterClass.AntiAddictNotify.class, AntiAddictNotifyOuterClass.AntiAddictNotify.Builder.class);
      }

      // Construct using AntiAddictNotifyOuterClass.AntiAddictNotify.newBuilder()
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
        msg_ = "";

        level_ = "";

        msgType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AntiAddictNotifyOuterClass.internal_static_AntiAddictNotify_descriptor;
      }

      @java.lang.Override
      public AntiAddictNotifyOuterClass.AntiAddictNotify getDefaultInstanceForType() {
        return AntiAddictNotifyOuterClass.AntiAddictNotify.getDefaultInstance();
      }

      @java.lang.Override
      public AntiAddictNotifyOuterClass.AntiAddictNotify build() {
        AntiAddictNotifyOuterClass.AntiAddictNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public AntiAddictNotifyOuterClass.AntiAddictNotify buildPartial() {
        AntiAddictNotifyOuterClass.AntiAddictNotify result = new AntiAddictNotifyOuterClass.AntiAddictNotify(this);
        result.msg_ = msg_;
        result.level_ = level_;
        result.msgType_ = msgType_;
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
        if (other instanceof AntiAddictNotifyOuterClass.AntiAddictNotify) {
          return mergeFrom((AntiAddictNotifyOuterClass.AntiAddictNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AntiAddictNotifyOuterClass.AntiAddictNotify other) {
        if (other == AntiAddictNotifyOuterClass.AntiAddictNotify.getDefaultInstance()) return this;
        if (!other.getMsg().isEmpty()) {
          msg_ = other.msg_;
          onChanged();
        }
        if (!other.getLevel().isEmpty()) {
          level_ = other.level_;
          onChanged();
        }
        if (other.getMsgType() != 0) {
          setMsgType(other.getMsgType());
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
        AntiAddictNotifyOuterClass.AntiAddictNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AntiAddictNotifyOuterClass.AntiAddictNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object msg_ = "";
      /**
       * <code>string msg = 3;</code>
       * @return The msg.
       */
      public java.lang.String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string msg = 3;</code>
       * @return The bytes for msg.
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        java.lang.Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string msg = 3;</code>
       * @param value The msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string msg = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMsg() {
        
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      /**
       * <code>string msg = 3;</code>
       * @param value The bytes for msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        msg_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object level_ = "";
      /**
       * <code>string level = 14;</code>
       * @return The level.
       */
      public java.lang.String getLevel() {
        java.lang.Object ref = level_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          level_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string level = 14;</code>
       * @return The bytes for level.
       */
      public com.google.protobuf.ByteString
          getLevelBytes() {
        java.lang.Object ref = level_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          level_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string level = 14;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string level = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = getDefaultInstance().getLevel();
        onChanged();
        return this;
      }
      /**
       * <code>string level = 14;</code>
       * @param value The bytes for level to set.
       * @return This builder for chaining.
       */
      public Builder setLevelBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        level_ = value;
        onChanged();
        return this;
      }

      private int msgType_ ;
      /**
       * <code>int32 msgType = 13;</code>
       * @return The msgType.
       */
      @java.lang.Override
      public int getMsgType() {
        return msgType_;
      }
      /**
       * <code>int32 msgType = 13;</code>
       * @param value The msgType to set.
       * @return This builder for chaining.
       */
      public Builder setMsgType(int value) {
        
        msgType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 msgType = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMsgType() {
        
        msgType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AntiAddictNotify)
    }

    // @@protoc_insertion_point(class_scope:AntiAddictNotify)
    private static final AntiAddictNotifyOuterClass.AntiAddictNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AntiAddictNotifyOuterClass.AntiAddictNotify();
    }

    public static AntiAddictNotifyOuterClass.AntiAddictNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AntiAddictNotify>
        PARSER = new com.google.protobuf.AbstractParser<AntiAddictNotify>() {
      @java.lang.Override
      public AntiAddictNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AntiAddictNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AntiAddictNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AntiAddictNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public AntiAddictNotifyOuterClass.AntiAddictNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AntiAddictNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AntiAddictNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026AntiAddictNotify.proto\"\217\001\n\020AntiAddictN" +
      "otify\022\013\n\003msg\030\003 \001(\t\022\r\n\005level\030\016 \001(\t\022\017\n\007msg" +
      "Type\030\r \001(\005\"N\n\013GCFCHEHELNP\022\010\n\004NONE\020\000\022\017\n\013P" +
      "EPPOHPHJOJ\020h\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLM" +
      "POEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AntiAddictNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AntiAddictNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AntiAddictNotify_descriptor,
        new java.lang.String[] { "Msg", "Level", "MsgType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
