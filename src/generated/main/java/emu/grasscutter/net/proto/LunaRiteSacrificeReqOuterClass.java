// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LunaRiteSacrificeReq.proto

public final class LunaRiteSacrificeReqOuterClass {
  private LunaRiteSacrificeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LunaRiteSacrificeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LunaRiteSacrificeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 index = 3;</code>
     * @return The index.
     */
    int getIndex();

    /**
     * <code>uint32 areaId = 2;</code>
     * @return The areaId.
     */
    int getAreaId();
  }
  /**
   * Protobuf type {@code LunaRiteSacrificeReq}
   */
  public static final class LunaRiteSacrificeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LunaRiteSacrificeReq)
      LunaRiteSacrificeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LunaRiteSacrificeReq.newBuilder() to construct.
    private LunaRiteSacrificeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LunaRiteSacrificeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LunaRiteSacrificeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LunaRiteSacrificeReq(
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
            case 16: {

              areaId_ = input.readUInt32();
              break;
            }
            case 24: {

              index_ = input.readUInt32();
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
      return LunaRiteSacrificeReqOuterClass.internal_static_LunaRiteSacrificeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LunaRiteSacrificeReqOuterClass.internal_static_LunaRiteSacrificeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.class, LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.Builder.class);
    }

    /**
     * Protobuf enum {@code LunaRiteSacrificeReq.GLLKONDGMNG}
     */
    public enum GLLKONDGMNG
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 8743;</code>
       */
      PEPPOHPHJOJ(1, 8743),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final GLLKONDGMNG DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final GLLKONDGMNG EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 8743;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 8743;
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
      public static GLLKONDGMNG valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static GLLKONDGMNG forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 8743: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<GLLKONDGMNG>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          GLLKONDGMNG> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<GLLKONDGMNG>() {
              public GLLKONDGMNG findValueByNumber(int number) {
                return GLLKONDGMNG.forNumber(number);
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
        return LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final GLLKONDGMNG[] VALUES = getStaticValuesArray();
      private static GLLKONDGMNG[] getStaticValuesArray() {
        return new GLLKONDGMNG[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static GLLKONDGMNG valueOf(
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

      private GLLKONDGMNG(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:LunaRiteSacrificeReq.GLLKONDGMNG)
    }

    public static final int INDEX_FIELD_NUMBER = 3;
    private int index_;
    /**
     * <code>uint32 index = 3;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }

    public static final int AREAID_FIELD_NUMBER = 2;
    private int areaId_;
    /**
     * <code>uint32 areaId = 2;</code>
     * @return The areaId.
     */
    @java.lang.Override
    public int getAreaId() {
      return areaId_;
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
      if (areaId_ != 0) {
        output.writeUInt32(2, areaId_);
      }
      if (index_ != 0) {
        output.writeUInt32(3, index_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (areaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, areaId_);
      }
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, index_);
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
      if (!(obj instanceof LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq)) {
        return super.equals(obj);
      }
      LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq other = (LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq) obj;

      if (getIndex()
          != other.getIndex()) return false;
      if (getAreaId()
          != other.getAreaId()) return false;
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
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      hash = (37 * hash) + AREAID_FIELD_NUMBER;
      hash = (53 * hash) + getAreaId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
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
    public static Builder newBuilder(LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq prototype) {
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
     * Protobuf type {@code LunaRiteSacrificeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LunaRiteSacrificeReq)
        LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LunaRiteSacrificeReqOuterClass.internal_static_LunaRiteSacrificeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LunaRiteSacrificeReqOuterClass.internal_static_LunaRiteSacrificeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.class, LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.Builder.class);
      }

      // Construct using LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.newBuilder()
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
        index_ = 0;

        areaId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return LunaRiteSacrificeReqOuterClass.internal_static_LunaRiteSacrificeReq_descriptor;
      }

      @java.lang.Override
      public LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq getDefaultInstanceForType() {
        return LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.getDefaultInstance();
      }

      @java.lang.Override
      public LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq build() {
        LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq buildPartial() {
        LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq result = new LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq(this);
        result.index_ = index_;
        result.areaId_ = areaId_;
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
        if (other instanceof LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq) {
          return mergeFrom((LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq other) {
        if (other == LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.getDefaultInstance()) return this;
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
        }
        if (other.getAreaId() != 0) {
          setAreaId(other.getAreaId());
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
        LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int index_ ;
      /**
       * <code>uint32 index = 3;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 3;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0;
        onChanged();
        return this;
      }

      private int areaId_ ;
      /**
       * <code>uint32 areaId = 2;</code>
       * @return The areaId.
       */
      @java.lang.Override
      public int getAreaId() {
        return areaId_;
      }
      /**
       * <code>uint32 areaId = 2;</code>
       * @param value The areaId to set.
       * @return This builder for chaining.
       */
      public Builder setAreaId(int value) {
        
        areaId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 areaId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaId() {
        
        areaId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LunaRiteSacrificeReq)
    }

    // @@protoc_insertion_point(class_scope:LunaRiteSacrificeReq)
    private static final LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq();
    }

    public static LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LunaRiteSacrificeReq>
        PARSER = new com.google.protobuf.AbstractParser<LunaRiteSacrificeReq>() {
      @java.lang.Override
      public LunaRiteSacrificeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LunaRiteSacrificeReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LunaRiteSacrificeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LunaRiteSacrificeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LunaRiteSacrificeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LunaRiteSacrificeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032LunaRiteSacrificeReq.proto\"\227\001\n\024LunaRit" +
      "eSacrificeReq\022\r\n\005index\030\003 \001(\r\022\016\n\006areaId\030\002" +
      " \001(\r\"`\n\013GLLKONDGMNG\022\010\n\004NONE\020\000\022\020\n\013PEPPOHP" +
      "HJOJ\020\247D\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020" +
      "\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LunaRiteSacrificeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LunaRiteSacrificeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LunaRiteSacrificeReq_descriptor,
        new java.lang.String[] { "Index", "AreaId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
