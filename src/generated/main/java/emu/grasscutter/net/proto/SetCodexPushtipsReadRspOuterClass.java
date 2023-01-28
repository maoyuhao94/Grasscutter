// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetCodexPushtipsReadRsp.proto

public final class SetCodexPushtipsReadRspOuterClass {
  private SetCodexPushtipsReadRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetCodexPushtipsReadRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetCodexPushtipsReadRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 codexId = 14;</code>
     * @return The codexId.
     */
    int getCodexId();

    /**
     * <code>uint32 typeId = 4;</code>
     * @return The typeId.
     */
    int getTypeId();

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code SetCodexPushtipsReadRsp}
   */
  public static final class SetCodexPushtipsReadRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetCodexPushtipsReadRsp)
      SetCodexPushtipsReadRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetCodexPushtipsReadRsp.newBuilder() to construct.
    private SetCodexPushtipsReadRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetCodexPushtipsReadRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetCodexPushtipsReadRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetCodexPushtipsReadRsp(
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
            case 32: {

              typeId_ = input.readUInt32();
              break;
            }
            case 88: {

              retcode_ = input.readInt32();
              break;
            }
            case 112: {

              codexId_ = input.readUInt32();
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
      return SetCodexPushtipsReadRspOuterClass.internal_static_SetCodexPushtipsReadRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SetCodexPushtipsReadRspOuterClass.internal_static_SetCodexPushtipsReadRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.class, SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code SetCodexPushtipsReadRsp.CLOBHCDJANA}
     */
    public enum CLOBHCDJANA
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4210;</code>
       */
      PEPPOHPHJOJ(1, 4210),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final CLOBHCDJANA DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4210;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4210;
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
      public static CLOBHCDJANA valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CLOBHCDJANA forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4210: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CLOBHCDJANA>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CLOBHCDJANA> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CLOBHCDJANA>() {
              public CLOBHCDJANA findValueByNumber(int number) {
                return CLOBHCDJANA.forNumber(number);
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
        return SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final CLOBHCDJANA[] VALUES = getStaticValuesArray();
      private static CLOBHCDJANA[] getStaticValuesArray() {
        return new CLOBHCDJANA[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static CLOBHCDJANA valueOf(
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

      private CLOBHCDJANA(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SetCodexPushtipsReadRsp.CLOBHCDJANA)
    }

    public static final int CODEXID_FIELD_NUMBER = 14;
    private int codexId_;
    /**
     * <code>uint32 codexId = 14;</code>
     * @return The codexId.
     */
    @java.lang.Override
    public int getCodexId() {
      return codexId_;
    }

    public static final int TYPEID_FIELD_NUMBER = 4;
    private int typeId_;
    /**
     * <code>uint32 typeId = 4;</code>
     * @return The typeId.
     */
    @java.lang.Override
    public int getTypeId() {
      return typeId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (typeId_ != 0) {
        output.writeUInt32(4, typeId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      if (codexId_ != 0) {
        output.writeUInt32(14, codexId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (typeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, typeId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      if (codexId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, codexId_);
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
      if (!(obj instanceof SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp)) {
        return super.equals(obj);
      }
      SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp other = (SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp) obj;

      if (getCodexId()
          != other.getCodexId()) return false;
      if (getTypeId()
          != other.getTypeId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + CODEXID_FIELD_NUMBER;
      hash = (53 * hash) + getCodexId();
      hash = (37 * hash) + TYPEID_FIELD_NUMBER;
      hash = (53 * hash) + getTypeId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
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
    public static Builder newBuilder(SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp prototype) {
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
     * Protobuf type {@code SetCodexPushtipsReadRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetCodexPushtipsReadRsp)
        SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SetCodexPushtipsReadRspOuterClass.internal_static_SetCodexPushtipsReadRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SetCodexPushtipsReadRspOuterClass.internal_static_SetCodexPushtipsReadRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.class, SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.Builder.class);
      }

      // Construct using SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.newBuilder()
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
        codexId_ = 0;

        typeId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SetCodexPushtipsReadRspOuterClass.internal_static_SetCodexPushtipsReadRsp_descriptor;
      }

      @java.lang.Override
      public SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp getDefaultInstanceForType() {
        return SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.getDefaultInstance();
      }

      @java.lang.Override
      public SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp build() {
        SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp buildPartial() {
        SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp result = new SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp(this);
        result.codexId_ = codexId_;
        result.typeId_ = typeId_;
        result.retcode_ = retcode_;
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
        if (other instanceof SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp) {
          return mergeFrom((SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp other) {
        if (other == SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.getDefaultInstance()) return this;
        if (other.getCodexId() != 0) {
          setCodexId(other.getCodexId());
        }
        if (other.getTypeId() != 0) {
          setTypeId(other.getTypeId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int codexId_ ;
      /**
       * <code>uint32 codexId = 14;</code>
       * @return The codexId.
       */
      @java.lang.Override
      public int getCodexId() {
        return codexId_;
      }
      /**
       * <code>uint32 codexId = 14;</code>
       * @param value The codexId to set.
       * @return This builder for chaining.
       */
      public Builder setCodexId(int value) {
        
        codexId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 codexId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCodexId() {
        
        codexId_ = 0;
        onChanged();
        return this;
      }

      private int typeId_ ;
      /**
       * <code>uint32 typeId = 4;</code>
       * @return The typeId.
       */
      @java.lang.Override
      public int getTypeId() {
        return typeId_;
      }
      /**
       * <code>uint32 typeId = 4;</code>
       * @param value The typeId to set.
       * @return This builder for chaining.
       */
      public Builder setTypeId(int value) {
        
        typeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 typeId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTypeId() {
        
        typeId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SetCodexPushtipsReadRsp)
    }

    // @@protoc_insertion_point(class_scope:SetCodexPushtipsReadRsp)
    private static final SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp();
    }

    public static SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetCodexPushtipsReadRsp>
        PARSER = new com.google.protobuf.AbstractParser<SetCodexPushtipsReadRsp>() {
      @java.lang.Override
      public SetCodexPushtipsReadRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetCodexPushtipsReadRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetCodexPushtipsReadRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetCodexPushtipsReadRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetCodexPushtipsReadRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetCodexPushtipsReadRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SetCodexPushtipsReadRsp.proto\"\234\001\n\027SetC" +
      "odexPushtipsReadRsp\022\017\n\007codexId\030\016 \001(\r\022\016\n\006" +
      "typeId\030\004 \001(\r\022\017\n\007retcode\030\013 \001(\005\"O\n\013CLOBHCD" +
      "JANA\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\362 \022\017\n\013DCDN" +
      "ILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetCodexPushtipsReadRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetCodexPushtipsReadRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetCodexPushtipsReadRsp_descriptor,
        new java.lang.String[] { "CodexId", "TypeId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
