// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetPlayerSignatureReq.proto

public final class SetPlayerSignatureReqOuterClass {
  private SetPlayerSignatureReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetPlayerSignatureReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetPlayerSignatureReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string signature = 15;</code>
     * @return The signature.
     */
    java.lang.String getSignature();
    /**
     * <code>string signature = 15;</code>
     * @return The bytes for signature.
     */
    com.google.protobuf.ByteString
        getSignatureBytes();
  }
  /**
   * Protobuf type {@code SetPlayerSignatureReq}
   */
  public static final class SetPlayerSignatureReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetPlayerSignatureReq)
      SetPlayerSignatureReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetPlayerSignatureReq.newBuilder() to construct.
    private SetPlayerSignatureReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetPlayerSignatureReq() {
      signature_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetPlayerSignatureReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetPlayerSignatureReq(
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
            case 122: {
              java.lang.String s = input.readStringRequireUtf8();

              signature_ = s;
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
      return SetPlayerSignatureReqOuterClass.internal_static_SetPlayerSignatureReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SetPlayerSignatureReqOuterClass.internal_static_SetPlayerSignatureReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq.class, SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq.Builder.class);
    }

    /**
     * Protobuf enum {@code SetPlayerSignatureReq.BCBOELNAOJK}
     */
    public enum BCBOELNAOJK
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4013;</code>
       */
      PEPPOHPHJOJ(1, 4013),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final BCBOELNAOJK DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final BCBOELNAOJK EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4013;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4013;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


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
      public static BCBOELNAOJK valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static BCBOELNAOJK forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4013: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<BCBOELNAOJK>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          BCBOELNAOJK> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<BCBOELNAOJK>() {
              public BCBOELNAOJK findValueByNumber(int number) {
                return BCBOELNAOJK.forNumber(number);
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
        return SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final BCBOELNAOJK[] VALUES = getStaticValuesArray();
      private static BCBOELNAOJK[] getStaticValuesArray() {
        return new BCBOELNAOJK[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static BCBOELNAOJK valueOf(
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

      private BCBOELNAOJK(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SetPlayerSignatureReq.BCBOELNAOJK)
    }

    public static final int SIGNATURE_FIELD_NUMBER = 15;
    private volatile java.lang.Object signature_;
    /**
     * <code>string signature = 15;</code>
     * @return The signature.
     */
    @java.lang.Override
    public java.lang.String getSignature() {
      java.lang.Object ref = signature_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signature_ = s;
        return s;
      }
    }
    /**
     * <code>string signature = 15;</code>
     * @return The bytes for signature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSignatureBytes() {
      java.lang.Object ref = signature_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signature_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signature_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 15, signature_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signature_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, signature_);
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
      if (!(obj instanceof SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq)) {
        return super.equals(obj);
      }
      SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq other = (SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq) obj;

      if (!getSignature()
          .equals(other.getSignature())) return false;
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
      hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
      hash = (53 * hash) + getSignature().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq parseFrom(
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
    public static Builder newBuilder(SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq prototype) {
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
     * Protobuf type {@code SetPlayerSignatureReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetPlayerSignatureReq)
        SetPlayerSignatureReqOuterClass.SetPlayerSignatureReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SetPlayerSignatureReqOuterClass.internal_static_SetPlayerSignatureReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SetPlayerSignatureReqOuterClass.internal_static_SetPlayerSignatureReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq.class, SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq.Builder.class);
      }

      // Construct using SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq.newBuilder()
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
        signature_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SetPlayerSignatureReqOuterClass.internal_static_SetPlayerSignatureReq_descriptor;
      }

      @java.lang.Override
      public SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq getDefaultInstanceForType() {
        return SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq.getDefaultInstance();
      }

      @java.lang.Override
      public SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq build() {
        SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq buildPartial() {
        SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq result = new SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq(this);
        result.signature_ = signature_;
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
        if (other instanceof SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq) {
          return mergeFrom((SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq other) {
        if (other == SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq.getDefaultInstance()) return this;
        if (!other.getSignature().isEmpty()) {
          signature_ = other.signature_;
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
        SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object signature_ = "";
      /**
       * <code>string signature = 15;</code>
       * @return The signature.
       */
      public java.lang.String getSignature() {
        java.lang.Object ref = signature_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          signature_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string signature = 15;</code>
       * @return The bytes for signature.
       */
      public com.google.protobuf.ByteString
          getSignatureBytes() {
        java.lang.Object ref = signature_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          signature_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string signature = 15;</code>
       * @param value The signature to set.
       * @return This builder for chaining.
       */
      public Builder setSignature(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        signature_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string signature = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSignature() {
        
        signature_ = getDefaultInstance().getSignature();
        onChanged();
        return this;
      }
      /**
       * <code>string signature = 15;</code>
       * @param value The bytes for signature to set.
       * @return This builder for chaining.
       */
      public Builder setSignatureBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        signature_ = value;
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


      // @@protoc_insertion_point(builder_scope:SetPlayerSignatureReq)
    }

    // @@protoc_insertion_point(class_scope:SetPlayerSignatureReq)
    private static final SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq();
    }

    public static SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetPlayerSignatureReq>
        PARSER = new com.google.protobuf.AbstractParser<SetPlayerSignatureReq>() {
      @java.lang.Override
      public SetPlayerSignatureReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetPlayerSignatureReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetPlayerSignatureReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetPlayerSignatureReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetPlayerSignatureReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetPlayerSignatureReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SetPlayerSignatureReq.proto\"\214\001\n\025SetPla" +
      "yerSignatureReq\022\021\n\tsignature\030\017 \001(\t\"`\n\013BC" +
      "BOELNAOJK\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\255\037\022\017\n" +
      "\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIA" +
      "BGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetPlayerSignatureReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetPlayerSignatureReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetPlayerSignatureReq_descriptor,
        new java.lang.String[] { "Signature", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
