// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MpPlayOwnerCheckRsp.proto

public final class MpPlayOwnerCheckRspOuterClass {
  private MpPlayOwnerCheckRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MpPlayOwnerCheckRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MpPlayOwnerCheckRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool isSkipMatch = 14;</code>
     * @return The isSkipMatch.
     */
    boolean getIsSkipMatch();

    /**
     * <code>uint32 wrongUid = 15;</code>
     * @return The wrongUid.
     */
    int getWrongUid();

    /**
     * <code>uint32 mpPlayId = 4;</code>
     * @return The mpPlayId.
     */
    int getMpPlayId();
  }
  /**
   * Protobuf type {@code MpPlayOwnerCheckRsp}
   */
  public static final class MpPlayOwnerCheckRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MpPlayOwnerCheckRsp)
      MpPlayOwnerCheckRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MpPlayOwnerCheckRsp.newBuilder() to construct.
    private MpPlayOwnerCheckRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MpPlayOwnerCheckRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MpPlayOwnerCheckRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MpPlayOwnerCheckRsp(
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

              mpPlayId_ = input.readUInt32();
              break;
            }
            case 104: {

              retcode_ = input.readInt32();
              break;
            }
            case 112: {

              isSkipMatch_ = input.readBool();
              break;
            }
            case 120: {

              wrongUid_ = input.readUInt32();
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
      return MpPlayOwnerCheckRspOuterClass.internal_static_MpPlayOwnerCheckRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MpPlayOwnerCheckRspOuterClass.internal_static_MpPlayOwnerCheckRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp.class, MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code MpPlayOwnerCheckRsp.ENCFJIJLEKO}
     */
    public enum ENCFJIJLEKO
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1807;</code>
       */
      PEPPOHPHJOJ(1, 1807),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final ENCFJIJLEKO DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1807;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1807;
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
      public static ENCFJIJLEKO valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static ENCFJIJLEKO forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1807: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ENCFJIJLEKO>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ENCFJIJLEKO> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ENCFJIJLEKO>() {
              public ENCFJIJLEKO findValueByNumber(int number) {
                return ENCFJIJLEKO.forNumber(number);
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
        return MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final ENCFJIJLEKO[] VALUES = getStaticValuesArray();
      private static ENCFJIJLEKO[] getStaticValuesArray() {
        return new ENCFJIJLEKO[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static ENCFJIJLEKO valueOf(
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

      private ENCFJIJLEKO(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MpPlayOwnerCheckRsp.ENCFJIJLEKO)
    }

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_;
    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ISSKIPMATCH_FIELD_NUMBER = 14;
    private boolean isSkipMatch_;
    /**
     * <code>bool isSkipMatch = 14;</code>
     * @return The isSkipMatch.
     */
    @java.lang.Override
    public boolean getIsSkipMatch() {
      return isSkipMatch_;
    }

    public static final int WRONGUID_FIELD_NUMBER = 15;
    private int wrongUid_;
    /**
     * <code>uint32 wrongUid = 15;</code>
     * @return The wrongUid.
     */
    @java.lang.Override
    public int getWrongUid() {
      return wrongUid_;
    }

    public static final int MPPLAYID_FIELD_NUMBER = 4;
    private int mpPlayId_;
    /**
     * <code>uint32 mpPlayId = 4;</code>
     * @return The mpPlayId.
     */
    @java.lang.Override
    public int getMpPlayId() {
      return mpPlayId_;
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
      if (mpPlayId_ != 0) {
        output.writeUInt32(4, mpPlayId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      if (isSkipMatch_ != false) {
        output.writeBool(14, isSkipMatch_);
      }
      if (wrongUid_ != 0) {
        output.writeUInt32(15, wrongUid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mpPlayId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, mpPlayId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, retcode_);
      }
      if (isSkipMatch_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isSkipMatch_);
      }
      if (wrongUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, wrongUid_);
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
      if (!(obj instanceof MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp)) {
        return super.equals(obj);
      }
      MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp other = (MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsSkipMatch()
          != other.getIsSkipMatch()) return false;
      if (getWrongUid()
          != other.getWrongUid()) return false;
      if (getMpPlayId()
          != other.getMpPlayId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ISSKIPMATCH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSkipMatch());
      hash = (37 * hash) + WRONGUID_FIELD_NUMBER;
      hash = (53 * hash) + getWrongUid();
      hash = (37 * hash) + MPPLAYID_FIELD_NUMBER;
      hash = (53 * hash) + getMpPlayId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parseFrom(
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
    public static Builder newBuilder(MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp prototype) {
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
     * Protobuf type {@code MpPlayOwnerCheckRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MpPlayOwnerCheckRsp)
        MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MpPlayOwnerCheckRspOuterClass.internal_static_MpPlayOwnerCheckRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MpPlayOwnerCheckRspOuterClass.internal_static_MpPlayOwnerCheckRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp.class, MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp.Builder.class);
      }

      // Construct using MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp.newBuilder()
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
        retcode_ = 0;

        isSkipMatch_ = false;

        wrongUid_ = 0;

        mpPlayId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MpPlayOwnerCheckRspOuterClass.internal_static_MpPlayOwnerCheckRsp_descriptor;
      }

      @java.lang.Override
      public MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp getDefaultInstanceForType() {
        return MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp.getDefaultInstance();
      }

      @java.lang.Override
      public MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp build() {
        MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp buildPartial() {
        MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp result = new MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp(this);
        result.retcode_ = retcode_;
        result.isSkipMatch_ = isSkipMatch_;
        result.wrongUid_ = wrongUid_;
        result.mpPlayId_ = mpPlayId_;
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
        if (other instanceof MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp) {
          return mergeFrom((MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp other) {
        if (other == MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsSkipMatch() != false) {
          setIsSkipMatch(other.getIsSkipMatch());
        }
        if (other.getWrongUid() != 0) {
          setWrongUid(other.getWrongUid());
        }
        if (other.getMpPlayId() != 0) {
          setMpPlayId(other.getMpPlayId());
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
        MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean isSkipMatch_ ;
      /**
       * <code>bool isSkipMatch = 14;</code>
       * @return The isSkipMatch.
       */
      @java.lang.Override
      public boolean getIsSkipMatch() {
        return isSkipMatch_;
      }
      /**
       * <code>bool isSkipMatch = 14;</code>
       * @param value The isSkipMatch to set.
       * @return This builder for chaining.
       */
      public Builder setIsSkipMatch(boolean value) {
        
        isSkipMatch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isSkipMatch = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSkipMatch() {
        
        isSkipMatch_ = false;
        onChanged();
        return this;
      }

      private int wrongUid_ ;
      /**
       * <code>uint32 wrongUid = 15;</code>
       * @return The wrongUid.
       */
      @java.lang.Override
      public int getWrongUid() {
        return wrongUid_;
      }
      /**
       * <code>uint32 wrongUid = 15;</code>
       * @param value The wrongUid to set.
       * @return This builder for chaining.
       */
      public Builder setWrongUid(int value) {
        
        wrongUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wrongUid = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearWrongUid() {
        
        wrongUid_ = 0;
        onChanged();
        return this;
      }

      private int mpPlayId_ ;
      /**
       * <code>uint32 mpPlayId = 4;</code>
       * @return The mpPlayId.
       */
      @java.lang.Override
      public int getMpPlayId() {
        return mpPlayId_;
      }
      /**
       * <code>uint32 mpPlayId = 4;</code>
       * @param value The mpPlayId to set.
       * @return This builder for chaining.
       */
      public Builder setMpPlayId(int value) {
        
        mpPlayId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mpPlayId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpPlayId() {
        
        mpPlayId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MpPlayOwnerCheckRsp)
    }

    // @@protoc_insertion_point(class_scope:MpPlayOwnerCheckRsp)
    private static final MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp();
    }

    public static MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MpPlayOwnerCheckRsp>
        PARSER = new com.google.protobuf.AbstractParser<MpPlayOwnerCheckRsp>() {
      @java.lang.Override
      public MpPlayOwnerCheckRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MpPlayOwnerCheckRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MpPlayOwnerCheckRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MpPlayOwnerCheckRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MpPlayOwnerCheckRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MpPlayOwnerCheckRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031MpPlayOwnerCheckRsp.proto\"\260\001\n\023MpPlayOw" +
      "nerCheckRsp\022\017\n\007retcode\030\r \001(\005\022\023\n\013isSkipMa" +
      "tch\030\016 \001(\010\022\020\n\010wrongUid\030\017 \001(\r\022\020\n\010mpPlayId\030" +
      "\004 \001(\r\"O\n\013ENCFJIJLEKO\022\010\n\004NONE\020\000\022\020\n\013PEPPOH" +
      "PHJOJ\020\217\016\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA" +
      "\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MpPlayOwnerCheckRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MpPlayOwnerCheckRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MpPlayOwnerCheckRsp_descriptor,
        new java.lang.String[] { "Retcode", "IsSkipMatch", "WrongUid", "MpPlayId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
