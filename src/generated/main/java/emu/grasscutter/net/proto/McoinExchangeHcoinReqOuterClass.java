// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: McoinExchangeHcoinReq.proto

public final class McoinExchangeHcoinReqOuterClass {
  private McoinExchangeHcoinReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface McoinExchangeHcoinReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:McoinExchangeHcoinReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 mcoinCost = 15;</code>
     * @return The mcoinCost.
     */
    int getMcoinCost();

    /**
     * <code>uint32 hcoin = 13;</code>
     * @return The hcoin.
     */
    int getHcoin();
  }
  /**
   * Protobuf type {@code McoinExchangeHcoinReq}
   */
  public static final class McoinExchangeHcoinReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:McoinExchangeHcoinReq)
      McoinExchangeHcoinReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use McoinExchangeHcoinReq.newBuilder() to construct.
    private McoinExchangeHcoinReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private McoinExchangeHcoinReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new McoinExchangeHcoinReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private McoinExchangeHcoinReq(
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
            case 104: {

              hcoin_ = input.readUInt32();
              break;
            }
            case 120: {

              mcoinCost_ = input.readUInt32();
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
      return McoinExchangeHcoinReqOuterClass.internal_static_McoinExchangeHcoinReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return McoinExchangeHcoinReqOuterClass.internal_static_McoinExchangeHcoinReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq.class, McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq.Builder.class);
    }

    /**
     * Protobuf enum {@code McoinExchangeHcoinReq.OMOIGICKHMH}
     */
    public enum OMOIGICKHMH
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 695;</code>
       */
      PEPPOHPHJOJ(1, 695),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final OMOIGICKHMH DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final OMOIGICKHMH EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 695;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 695;
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
      public static OMOIGICKHMH valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static OMOIGICKHMH forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 695: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<OMOIGICKHMH>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          OMOIGICKHMH> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<OMOIGICKHMH>() {
              public OMOIGICKHMH findValueByNumber(int number) {
                return OMOIGICKHMH.forNumber(number);
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
        return McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final OMOIGICKHMH[] VALUES = getStaticValuesArray();
      private static OMOIGICKHMH[] getStaticValuesArray() {
        return new OMOIGICKHMH[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static OMOIGICKHMH valueOf(
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

      private OMOIGICKHMH(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:McoinExchangeHcoinReq.OMOIGICKHMH)
    }

    public static final int MCOINCOST_FIELD_NUMBER = 15;
    private int mcoinCost_;
    /**
     * <code>uint32 mcoinCost = 15;</code>
     * @return The mcoinCost.
     */
    @java.lang.Override
    public int getMcoinCost() {
      return mcoinCost_;
    }

    public static final int HCOIN_FIELD_NUMBER = 13;
    private int hcoin_;
    /**
     * <code>uint32 hcoin = 13;</code>
     * @return The hcoin.
     */
    @java.lang.Override
    public int getHcoin() {
      return hcoin_;
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
      if (hcoin_ != 0) {
        output.writeUInt32(13, hcoin_);
      }
      if (mcoinCost_ != 0) {
        output.writeUInt32(15, mcoinCost_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hcoin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, hcoin_);
      }
      if (mcoinCost_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, mcoinCost_);
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
      if (!(obj instanceof McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq)) {
        return super.equals(obj);
      }
      McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq other = (McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq) obj;

      if (getMcoinCost()
          != other.getMcoinCost()) return false;
      if (getHcoin()
          != other.getHcoin()) return false;
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
      hash = (37 * hash) + MCOINCOST_FIELD_NUMBER;
      hash = (53 * hash) + getMcoinCost();
      hash = (37 * hash) + HCOIN_FIELD_NUMBER;
      hash = (53 * hash) + getHcoin();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq parseFrom(
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
    public static Builder newBuilder(McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq prototype) {
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
     * Protobuf type {@code McoinExchangeHcoinReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:McoinExchangeHcoinReq)
        McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return McoinExchangeHcoinReqOuterClass.internal_static_McoinExchangeHcoinReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return McoinExchangeHcoinReqOuterClass.internal_static_McoinExchangeHcoinReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq.class, McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq.Builder.class);
      }

      // Construct using McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq.newBuilder()
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
        mcoinCost_ = 0;

        hcoin_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return McoinExchangeHcoinReqOuterClass.internal_static_McoinExchangeHcoinReq_descriptor;
      }

      @java.lang.Override
      public McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq getDefaultInstanceForType() {
        return McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq.getDefaultInstance();
      }

      @java.lang.Override
      public McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq build() {
        McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq buildPartial() {
        McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq result = new McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq(this);
        result.mcoinCost_ = mcoinCost_;
        result.hcoin_ = hcoin_;
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
        if (other instanceof McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq) {
          return mergeFrom((McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq other) {
        if (other == McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq.getDefaultInstance()) return this;
        if (other.getMcoinCost() != 0) {
          setMcoinCost(other.getMcoinCost());
        }
        if (other.getHcoin() != 0) {
          setHcoin(other.getHcoin());
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
        McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int mcoinCost_ ;
      /**
       * <code>uint32 mcoinCost = 15;</code>
       * @return The mcoinCost.
       */
      @java.lang.Override
      public int getMcoinCost() {
        return mcoinCost_;
      }
      /**
       * <code>uint32 mcoinCost = 15;</code>
       * @param value The mcoinCost to set.
       * @return This builder for chaining.
       */
      public Builder setMcoinCost(int value) {
        
        mcoinCost_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mcoinCost = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMcoinCost() {
        
        mcoinCost_ = 0;
        onChanged();
        return this;
      }

      private int hcoin_ ;
      /**
       * <code>uint32 hcoin = 13;</code>
       * @return The hcoin.
       */
      @java.lang.Override
      public int getHcoin() {
        return hcoin_;
      }
      /**
       * <code>uint32 hcoin = 13;</code>
       * @param value The hcoin to set.
       * @return This builder for chaining.
       */
      public Builder setHcoin(int value) {
        
        hcoin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hcoin = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearHcoin() {
        
        hcoin_ = 0;
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


      // @@protoc_insertion_point(builder_scope:McoinExchangeHcoinReq)
    }

    // @@protoc_insertion_point(class_scope:McoinExchangeHcoinReq)
    private static final McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq();
    }

    public static McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<McoinExchangeHcoinReq>
        PARSER = new com.google.protobuf.AbstractParser<McoinExchangeHcoinReq>() {
      @java.lang.Override
      public McoinExchangeHcoinReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new McoinExchangeHcoinReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<McoinExchangeHcoinReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<McoinExchangeHcoinReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_McoinExchangeHcoinReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_McoinExchangeHcoinReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033McoinExchangeHcoinReq.proto\"\233\001\n\025McoinE" +
      "xchangeHcoinReq\022\021\n\tmcoinCost\030\017 \001(\r\022\r\n\005hc" +
      "oin\030\r \001(\r\"`\n\013OMOIGICKHMH\022\010\n\004NONE\020\000\022\020\n\013PE" +
      "PPOHPHJOJ\020\267\005\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLM" +
      "POEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_McoinExchangeHcoinReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_McoinExchangeHcoinReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_McoinExchangeHcoinReq_descriptor,
        new java.lang.String[] { "McoinCost", "Hcoin", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
