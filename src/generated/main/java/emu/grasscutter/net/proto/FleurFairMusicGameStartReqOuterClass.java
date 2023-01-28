// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairMusicGameStartReq.proto

public final class FleurFairMusicGameStartReqOuterClass {
  private FleurFairMusicGameStartReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairMusicGameStartReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairMusicGameStartReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 musicBasicId = 8;</code>
     * @return The musicBasicId.
     */
    int getMusicBasicId();
  }
  /**
   * Protobuf type {@code FleurFairMusicGameStartReq}
   */
  public static final class FleurFairMusicGameStartReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairMusicGameStartReq)
      FleurFairMusicGameStartReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairMusicGameStartReq.newBuilder() to construct.
    private FleurFairMusicGameStartReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairMusicGameStartReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairMusicGameStartReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FleurFairMusicGameStartReq(
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

              musicBasicId_ = input.readUInt32();
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
      return FleurFairMusicGameStartReqOuterClass.internal_static_FleurFairMusicGameStartReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return FleurFairMusicGameStartReqOuterClass.internal_static_FleurFairMusicGameStartReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.class, FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.Builder.class);
    }

    /**
     * Protobuf enum {@code FleurFairMusicGameStartReq.PFDBOCEADKK}
     */
    public enum PFDBOCEADKK
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 2105;</code>
       */
      PEPPOHPHJOJ(1, 2105),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final PFDBOCEADKK DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final PFDBOCEADKK EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 2105;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 2105;
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
      public static PFDBOCEADKK valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PFDBOCEADKK forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 2105: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PFDBOCEADKK>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PFDBOCEADKK> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PFDBOCEADKK>() {
              public PFDBOCEADKK findValueByNumber(int number) {
                return PFDBOCEADKK.forNumber(number);
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
        return FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final PFDBOCEADKK[] VALUES = getStaticValuesArray();
      private static PFDBOCEADKK[] getStaticValuesArray() {
        return new PFDBOCEADKK[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static PFDBOCEADKK valueOf(
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

      private PFDBOCEADKK(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:FleurFairMusicGameStartReq.PFDBOCEADKK)
    }

    public static final int MUSICBASICID_FIELD_NUMBER = 8;
    private int musicBasicId_;
    /**
     * <code>uint32 musicBasicId = 8;</code>
     * @return The musicBasicId.
     */
    @java.lang.Override
    public int getMusicBasicId() {
      return musicBasicId_;
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
      if (musicBasicId_ != 0) {
        output.writeUInt32(8, musicBasicId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (musicBasicId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, musicBasicId_);
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
      if (!(obj instanceof FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq)) {
        return super.equals(obj);
      }
      FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq other = (FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq) obj;

      if (getMusicBasicId()
          != other.getMusicBasicId()) return false;
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
      hash = (37 * hash) + MUSICBASICID_FIELD_NUMBER;
      hash = (53 * hash) + getMusicBasicId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
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
    public static Builder newBuilder(FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq prototype) {
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
     * Protobuf type {@code FleurFairMusicGameStartReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairMusicGameStartReq)
        FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return FleurFairMusicGameStartReqOuterClass.internal_static_FleurFairMusicGameStartReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return FleurFairMusicGameStartReqOuterClass.internal_static_FleurFairMusicGameStartReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.class, FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.Builder.class);
      }

      // Construct using FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.newBuilder()
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
        musicBasicId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return FleurFairMusicGameStartReqOuterClass.internal_static_FleurFairMusicGameStartReq_descriptor;
      }

      @java.lang.Override
      public FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq getDefaultInstanceForType() {
        return FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.getDefaultInstance();
      }

      @java.lang.Override
      public FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq build() {
        FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq buildPartial() {
        FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq result = new FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq(this);
        result.musicBasicId_ = musicBasicId_;
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
        if (other instanceof FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq) {
          return mergeFrom((FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq other) {
        if (other == FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.getDefaultInstance()) return this;
        if (other.getMusicBasicId() != 0) {
          setMusicBasicId(other.getMusicBasicId());
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
        FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int musicBasicId_ ;
      /**
       * <code>uint32 musicBasicId = 8;</code>
       * @return The musicBasicId.
       */
      @java.lang.Override
      public int getMusicBasicId() {
        return musicBasicId_;
      }
      /**
       * <code>uint32 musicBasicId = 8;</code>
       * @param value The musicBasicId to set.
       * @return This builder for chaining.
       */
      public Builder setMusicBasicId(int value) {
        
        musicBasicId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 musicBasicId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMusicBasicId() {
        
        musicBasicId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FleurFairMusicGameStartReq)
    }

    // @@protoc_insertion_point(class_scope:FleurFairMusicGameStartReq)
    private static final FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq();
    }

    public static FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairMusicGameStartReq>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairMusicGameStartReq>() {
      @java.lang.Override
      public FleurFairMusicGameStartReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FleurFairMusicGameStartReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FleurFairMusicGameStartReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairMusicGameStartReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairMusicGameStartReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairMusicGameStartReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n FleurFairMusicGameStartReq.proto\"\224\001\n\032F" +
      "leurFairMusicGameStartReq\022\024\n\014musicBasicI" +
      "d\030\010 \001(\r\"`\n\013PFDBOCEADKK\022\010\n\004NONE\020\000\022\020\n\013PEPP" +
      "OHPHJOJ\020\271\020\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPO" +
      "EA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FleurFairMusicGameStartReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairMusicGameStartReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairMusicGameStartReq_descriptor,
        new java.lang.String[] { "MusicBasicId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
