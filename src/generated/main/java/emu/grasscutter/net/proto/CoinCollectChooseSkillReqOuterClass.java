// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoinCollectChooseSkillReq.proto

public final class CoinCollectChooseSkillReqOuterClass {
  private CoinCollectChooseSkillReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoinCollectChooseSkillReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoinCollectChooseSkillReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 levelId = 10;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 chooseSkillNo = 7;</code>
     * @return The chooseSkillNo.
     */
    int getChooseSkillNo();
  }
  /**
   * Protobuf type {@code CoinCollectChooseSkillReq}
   */
  public static final class CoinCollectChooseSkillReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoinCollectChooseSkillReq)
      CoinCollectChooseSkillReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoinCollectChooseSkillReq.newBuilder() to construct.
    private CoinCollectChooseSkillReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoinCollectChooseSkillReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoinCollectChooseSkillReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CoinCollectChooseSkillReq(
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
            case 56: {

              chooseSkillNo_ = input.readUInt32();
              break;
            }
            case 80: {

              levelId_ = input.readUInt32();
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
      return CoinCollectChooseSkillReqOuterClass.internal_static_CoinCollectChooseSkillReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CoinCollectChooseSkillReqOuterClass.internal_static_CoinCollectChooseSkillReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq.class, CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq.Builder.class);
    }

    /**
     * Protobuf enum {@code CoinCollectChooseSkillReq.AHEPOAMJKNB}
     */
    public enum AHEPOAMJKNB
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 20307;</code>
       */
      PEPPOHPHJOJ(1, 20307),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final AHEPOAMJKNB DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final AHEPOAMJKNB EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 20307;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 20307;
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
      public static AHEPOAMJKNB valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static AHEPOAMJKNB forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 20307: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<AHEPOAMJKNB>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          AHEPOAMJKNB> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AHEPOAMJKNB>() {
              public AHEPOAMJKNB findValueByNumber(int number) {
                return AHEPOAMJKNB.forNumber(number);
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
        return CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final AHEPOAMJKNB[] VALUES = getStaticValuesArray();
      private static AHEPOAMJKNB[] getStaticValuesArray() {
        return new AHEPOAMJKNB[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static AHEPOAMJKNB valueOf(
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

      private AHEPOAMJKNB(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:CoinCollectChooseSkillReq.AHEPOAMJKNB)
    }

    public static final int LEVELID_FIELD_NUMBER = 10;
    private int levelId_;
    /**
     * <code>uint32 levelId = 10;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int CHOOSESKILLNO_FIELD_NUMBER = 7;
    private int chooseSkillNo_;
    /**
     * <code>uint32 chooseSkillNo = 7;</code>
     * @return The chooseSkillNo.
     */
    @java.lang.Override
    public int getChooseSkillNo() {
      return chooseSkillNo_;
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
      if (chooseSkillNo_ != 0) {
        output.writeUInt32(7, chooseSkillNo_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(10, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (chooseSkillNo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, chooseSkillNo_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
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
      if (!(obj instanceof CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq)) {
        return super.equals(obj);
      }
      CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq other = (CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getChooseSkillNo()
          != other.getChooseSkillNo()) return false;
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
      hash = (37 * hash) + LEVELID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + CHOOSESKILLNO_FIELD_NUMBER;
      hash = (53 * hash) + getChooseSkillNo();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq parseFrom(
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
    public static Builder newBuilder(CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq prototype) {
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
     * Protobuf type {@code CoinCollectChooseSkillReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoinCollectChooseSkillReq)
        CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CoinCollectChooseSkillReqOuterClass.internal_static_CoinCollectChooseSkillReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CoinCollectChooseSkillReqOuterClass.internal_static_CoinCollectChooseSkillReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq.class, CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq.Builder.class);
      }

      // Construct using CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq.newBuilder()
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
        levelId_ = 0;

        chooseSkillNo_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CoinCollectChooseSkillReqOuterClass.internal_static_CoinCollectChooseSkillReq_descriptor;
      }

      @java.lang.Override
      public CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq getDefaultInstanceForType() {
        return CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq.getDefaultInstance();
      }

      @java.lang.Override
      public CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq build() {
        CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq buildPartial() {
        CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq result = new CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq(this);
        result.levelId_ = levelId_;
        result.chooseSkillNo_ = chooseSkillNo_;
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
        if (other instanceof CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq) {
          return mergeFrom((CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq other) {
        if (other == CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getChooseSkillNo() != 0) {
          setChooseSkillNo(other.getChooseSkillNo());
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
        CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 levelId = 10;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 levelId = 10;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 levelId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int chooseSkillNo_ ;
      /**
       * <code>uint32 chooseSkillNo = 7;</code>
       * @return The chooseSkillNo.
       */
      @java.lang.Override
      public int getChooseSkillNo() {
        return chooseSkillNo_;
      }
      /**
       * <code>uint32 chooseSkillNo = 7;</code>
       * @param value The chooseSkillNo to set.
       * @return This builder for chaining.
       */
      public Builder setChooseSkillNo(int value) {
        
        chooseSkillNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chooseSkillNo = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearChooseSkillNo() {
        
        chooseSkillNo_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CoinCollectChooseSkillReq)
    }

    // @@protoc_insertion_point(class_scope:CoinCollectChooseSkillReq)
    private static final CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq();
    }

    public static CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoinCollectChooseSkillReq>
        PARSER = new com.google.protobuf.AbstractParser<CoinCollectChooseSkillReq>() {
      @java.lang.Override
      public CoinCollectChooseSkillReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CoinCollectChooseSkillReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CoinCollectChooseSkillReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoinCollectChooseSkillReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public CoinCollectChooseSkillReqOuterClass.CoinCollectChooseSkillReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoinCollectChooseSkillReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoinCollectChooseSkillReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037CoinCollectChooseSkillReq.proto\"\246\001\n\031Co" +
      "inCollectChooseSkillReq\022\017\n\007levelId\030\n \001(\r" +
      "\022\025\n\rchooseSkillNo\030\007 \001(\r\"a\n\013AHEPOAMJKNB\022\010" +
      "\n\004NONE\020\000\022\021\n\013PEPPOHPHJOJ\020\323\236\001\022\017\n\013DCDNILFDF" +
      "LB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002" +
      "\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CoinCollectChooseSkillReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoinCollectChooseSkillReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoinCollectChooseSkillReq_descriptor,
        new java.lang.String[] { "LevelId", "ChooseSkillNo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
