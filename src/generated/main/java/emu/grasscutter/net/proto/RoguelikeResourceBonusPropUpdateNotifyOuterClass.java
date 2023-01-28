// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeResourceBonusPropUpdateNotify.proto

public final class RoguelikeResourceBonusPropUpdateNotifyOuterClass {
  private RoguelikeResourceBonusPropUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeResourceBonusPropUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeResourceBonusPropUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float bonusResourceProp = 2;</code>
     * @return The bonusResourceProp.
     */
    float getBonusResourceProp();
  }
  /**
   * Protobuf type {@code RoguelikeResourceBonusPropUpdateNotify}
   */
  public static final class RoguelikeResourceBonusPropUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeResourceBonusPropUpdateNotify)
      RoguelikeResourceBonusPropUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeResourceBonusPropUpdateNotify.newBuilder() to construct.
    private RoguelikeResourceBonusPropUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeResourceBonusPropUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeResourceBonusPropUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoguelikeResourceBonusPropUpdateNotify(
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
            case 21: {

              bonusResourceProp_ = input.readFloat();
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
      return RoguelikeResourceBonusPropUpdateNotifyOuterClass.internal_static_RoguelikeResourceBonusPropUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RoguelikeResourceBonusPropUpdateNotifyOuterClass.internal_static_RoguelikeResourceBonusPropUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.class, RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code RoguelikeResourceBonusPropUpdateNotify.HMCGAAGGLCJ}
     */
    public enum HMCGAAGGLCJ
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 8858;</code>
       */
      PEPPOHPHJOJ(1, 8858),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final HMCGAAGGLCJ DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 8858;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 8858;
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
      public static HMCGAAGGLCJ valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static HMCGAAGGLCJ forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 8858: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<HMCGAAGGLCJ>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          HMCGAAGGLCJ> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<HMCGAAGGLCJ>() {
              public HMCGAAGGLCJ findValueByNumber(int number) {
                return HMCGAAGGLCJ.forNumber(number);
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
        return RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final HMCGAAGGLCJ[] VALUES = getStaticValuesArray();
      private static HMCGAAGGLCJ[] getStaticValuesArray() {
        return new HMCGAAGGLCJ[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static HMCGAAGGLCJ valueOf(
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

      private HMCGAAGGLCJ(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:RoguelikeResourceBonusPropUpdateNotify.HMCGAAGGLCJ)
    }

    public static final int BONUSRESOURCEPROP_FIELD_NUMBER = 2;
    private float bonusResourceProp_;
    /**
     * <code>float bonusResourceProp = 2;</code>
     * @return The bonusResourceProp.
     */
    @java.lang.Override
    public float getBonusResourceProp() {
      return bonusResourceProp_;
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
      if (java.lang.Float.floatToRawIntBits(bonusResourceProp_) != 0) {
        output.writeFloat(2, bonusResourceProp_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(bonusResourceProp_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, bonusResourceProp_);
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
      if (!(obj instanceof RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify)) {
        return super.equals(obj);
      }
      RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify other = (RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify) obj;

      if (java.lang.Float.floatToIntBits(getBonusResourceProp())
          != java.lang.Float.floatToIntBits(
              other.getBonusResourceProp())) return false;
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
      hash = (37 * hash) + BONUSRESOURCEPROP_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getBonusResourceProp());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
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
    public static Builder newBuilder(RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify prototype) {
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
     * Protobuf type {@code RoguelikeResourceBonusPropUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeResourceBonusPropUpdateNotify)
        RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RoguelikeResourceBonusPropUpdateNotifyOuterClass.internal_static_RoguelikeResourceBonusPropUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RoguelikeResourceBonusPropUpdateNotifyOuterClass.internal_static_RoguelikeResourceBonusPropUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.class, RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.Builder.class);
      }

      // Construct using RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.newBuilder()
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
        bonusResourceProp_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RoguelikeResourceBonusPropUpdateNotifyOuterClass.internal_static_RoguelikeResourceBonusPropUpdateNotify_descriptor;
      }

      @java.lang.Override
      public RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify getDefaultInstanceForType() {
        return RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify build() {
        RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify buildPartial() {
        RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify result = new RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify(this);
        result.bonusResourceProp_ = bonusResourceProp_;
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
        if (other instanceof RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify) {
          return mergeFrom((RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify other) {
        if (other == RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.getDefaultInstance()) return this;
        if (other.getBonusResourceProp() != 0F) {
          setBonusResourceProp(other.getBonusResourceProp());
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
        RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float bonusResourceProp_ ;
      /**
       * <code>float bonusResourceProp = 2;</code>
       * @return The bonusResourceProp.
       */
      @java.lang.Override
      public float getBonusResourceProp() {
        return bonusResourceProp_;
      }
      /**
       * <code>float bonusResourceProp = 2;</code>
       * @param value The bonusResourceProp to set.
       * @return This builder for chaining.
       */
      public Builder setBonusResourceProp(float value) {
        
        bonusResourceProp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float bonusResourceProp = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBonusResourceProp() {
        
        bonusResourceProp_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeResourceBonusPropUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeResourceBonusPropUpdateNotify)
    private static final RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify();
    }

    public static RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeResourceBonusPropUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeResourceBonusPropUpdateNotify>() {
      @java.lang.Override
      public RoguelikeResourceBonusPropUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoguelikeResourceBonusPropUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoguelikeResourceBonusPropUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeResourceBonusPropUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeResourceBonusPropUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeResourceBonusPropUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,RoguelikeResourceBonusPropUpdateNotify" +
      ".proto\"\224\001\n&RoguelikeResourceBonusPropUpd" +
      "ateNotify\022\031\n\021bonusResourceProp\030\002 \001(\002\"O\n\013" +
      "HMCGAAGGLCJ\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\232E\022" +
      "\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeResourceBonusPropUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeResourceBonusPropUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeResourceBonusPropUpdateNotify_descriptor,
        new java.lang.String[] { "BonusResourceProp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
