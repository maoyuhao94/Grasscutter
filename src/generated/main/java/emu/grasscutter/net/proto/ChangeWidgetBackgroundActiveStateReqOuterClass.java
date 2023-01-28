// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeWidgetBackgroundActiveStateReq.proto

public final class ChangeWidgetBackgroundActiveStateReqOuterClass {
  private ChangeWidgetBackgroundActiveStateReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeWidgetBackgroundActiveStateReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeWidgetBackgroundActiveStateReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 materialId = 8;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>bool isActive = 9;</code>
     * @return The isActive.
     */
    boolean getIsActive();
  }
  /**
   * Protobuf type {@code ChangeWidgetBackgroundActiveStateReq}
   */
  public static final class ChangeWidgetBackgroundActiveStateReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeWidgetBackgroundActiveStateReq)
      ChangeWidgetBackgroundActiveStateReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeWidgetBackgroundActiveStateReq.newBuilder() to construct.
    private ChangeWidgetBackgroundActiveStateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeWidgetBackgroundActiveStateReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeWidgetBackgroundActiveStateReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeWidgetBackgroundActiveStateReq(
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
            case 64: {

              materialId_ = input.readUInt32();
              break;
            }
            case 72: {

              isActive_ = input.readBool();
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
      return ChangeWidgetBackgroundActiveStateReqOuterClass.internal_static_ChangeWidgetBackgroundActiveStateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChangeWidgetBackgroundActiveStateReqOuterClass.internal_static_ChangeWidgetBackgroundActiveStateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.class, ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.Builder.class);
    }

    /**
     * Protobuf enum {@code ChangeWidgetBackgroundActiveStateReq.DJJNCLHIPBO}
     */
    public enum DJJNCLHIPBO
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 6092;</code>
       */
      PEPPOHPHJOJ(1, 6092),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final DJJNCLHIPBO DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final DJJNCLHIPBO EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 6092;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 6092;
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
      public static DJJNCLHIPBO valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static DJJNCLHIPBO forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 6092: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DJJNCLHIPBO>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DJJNCLHIPBO> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DJJNCLHIPBO>() {
              public DJJNCLHIPBO findValueByNumber(int number) {
                return DJJNCLHIPBO.forNumber(number);
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
        return ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final DJJNCLHIPBO[] VALUES = getStaticValuesArray();
      private static DJJNCLHIPBO[] getStaticValuesArray() {
        return new DJJNCLHIPBO[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static DJJNCLHIPBO valueOf(
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

      private DJJNCLHIPBO(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ChangeWidgetBackgroundActiveStateReq.DJJNCLHIPBO)
    }

    public static final int MATERIALID_FIELD_NUMBER = 8;
    private int materialId_;
    /**
     * <code>uint32 materialId = 8;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int ISACTIVE_FIELD_NUMBER = 9;
    private boolean isActive_;
    /**
     * <code>bool isActive = 9;</code>
     * @return The isActive.
     */
    @java.lang.Override
    public boolean getIsActive() {
      return isActive_;
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
      if (materialId_ != 0) {
        output.writeUInt32(8, materialId_);
      }
      if (isActive_ != false) {
        output.writeBool(9, isActive_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, materialId_);
      }
      if (isActive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isActive_);
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
      if (!(obj instanceof ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq)) {
        return super.equals(obj);
      }
      ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq other = (ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq) obj;

      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (getIsActive()
          != other.getIsActive()) return false;
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
      hash = (37 * hash) + MATERIALID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + ISACTIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsActive());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
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
    public static Builder newBuilder(ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq prototype) {
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
     * Protobuf type {@code ChangeWidgetBackgroundActiveStateReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeWidgetBackgroundActiveStateReq)
        ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChangeWidgetBackgroundActiveStateReqOuterClass.internal_static_ChangeWidgetBackgroundActiveStateReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChangeWidgetBackgroundActiveStateReqOuterClass.internal_static_ChangeWidgetBackgroundActiveStateReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.class, ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.Builder.class);
      }

      // Construct using ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.newBuilder()
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
        materialId_ = 0;

        isActive_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChangeWidgetBackgroundActiveStateReqOuterClass.internal_static_ChangeWidgetBackgroundActiveStateReq_descriptor;
      }

      @java.lang.Override
      public ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq getDefaultInstanceForType() {
        return ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.getDefaultInstance();
      }

      @java.lang.Override
      public ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq build() {
        ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq buildPartial() {
        ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq result = new ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq(this);
        result.materialId_ = materialId_;
        result.isActive_ = isActive_;
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
        if (other instanceof ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq) {
          return mergeFrom((ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq other) {
        if (other == ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.getDefaultInstance()) return this;
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (other.getIsActive() != false) {
          setIsActive(other.getIsActive());
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
        ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 materialId = 8;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 materialId = 8;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 materialId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
        onChanged();
        return this;
      }

      private boolean isActive_ ;
      /**
       * <code>bool isActive = 9;</code>
       * @return The isActive.
       */
      @java.lang.Override
      public boolean getIsActive() {
        return isActive_;
      }
      /**
       * <code>bool isActive = 9;</code>
       * @param value The isActive to set.
       * @return This builder for chaining.
       */
      public Builder setIsActive(boolean value) {
        
        isActive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isActive = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsActive() {
        
        isActive_ = false;
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


      // @@protoc_insertion_point(builder_scope:ChangeWidgetBackgroundActiveStateReq)
    }

    // @@protoc_insertion_point(class_scope:ChangeWidgetBackgroundActiveStateReq)
    private static final ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq();
    }

    public static ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeWidgetBackgroundActiveStateReq>
        PARSER = new com.google.protobuf.AbstractParser<ChangeWidgetBackgroundActiveStateReq>() {
      @java.lang.Override
      public ChangeWidgetBackgroundActiveStateReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeWidgetBackgroundActiveStateReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeWidgetBackgroundActiveStateReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeWidgetBackgroundActiveStateReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeWidgetBackgroundActiveStateReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeWidgetBackgroundActiveStateReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*ChangeWidgetBackgroundActiveStateReq.p" +
      "roto\"\256\001\n$ChangeWidgetBackgroundActiveSta" +
      "teReq\022\022\n\nmaterialId\030\010 \001(\r\022\020\n\010isActive\030\t " +
      "\001(\010\"`\n\013DJJNCLHIPBO\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPH" +
      "JOJ\020\314/\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001" +
      "\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeWidgetBackgroundActiveStateReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeWidgetBackgroundActiveStateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeWidgetBackgroundActiveStateReq_descriptor,
        new java.lang.String[] { "MaterialId", "IsActive", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
