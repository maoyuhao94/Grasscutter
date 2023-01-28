// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SubmitInferenceWordReq.proto

public final class SubmitInferenceWordReqOuterClass {
  private SubmitInferenceWordReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SubmitInferenceWordReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SubmitInferenceWordReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 pageId = 13;</code>
     * @return The pageId.
     */
    int getPageId();

    /**
     * <code>uint32 wordId = 9;</code>
     * @return The wordId.
     */
    int getWordId();
  }
  /**
   * Protobuf type {@code SubmitInferenceWordReq}
   */
  public static final class SubmitInferenceWordReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SubmitInferenceWordReq)
      SubmitInferenceWordReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SubmitInferenceWordReq.newBuilder() to construct.
    private SubmitInferenceWordReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SubmitInferenceWordReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SubmitInferenceWordReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SubmitInferenceWordReq(
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
            case 72: {

              wordId_ = input.readUInt32();
              break;
            }
            case 104: {

              pageId_ = input.readUInt32();
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
      return SubmitInferenceWordReqOuterClass.internal_static_SubmitInferenceWordReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SubmitInferenceWordReqOuterClass.internal_static_SubmitInferenceWordReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq.class, SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq.Builder.class);
    }

    /**
     * Protobuf enum {@code SubmitInferenceWordReq.MBJGANFDAIG}
     */
    public enum MBJGANFDAIG
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 454;</code>
       */
      PEPPOHPHJOJ(1, 454),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final MBJGANFDAIG DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final MBJGANFDAIG EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 454;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 454;
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
      public static MBJGANFDAIG valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MBJGANFDAIG forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 454: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MBJGANFDAIG>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MBJGANFDAIG> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MBJGANFDAIG>() {
              public MBJGANFDAIG findValueByNumber(int number) {
                return MBJGANFDAIG.forNumber(number);
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
        return SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final MBJGANFDAIG[] VALUES = getStaticValuesArray();
      private static MBJGANFDAIG[] getStaticValuesArray() {
        return new MBJGANFDAIG[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static MBJGANFDAIG valueOf(
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

      private MBJGANFDAIG(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SubmitInferenceWordReq.MBJGANFDAIG)
    }

    public static final int PAGEID_FIELD_NUMBER = 13;
    private int pageId_;
    /**
     * <code>uint32 pageId = 13;</code>
     * @return The pageId.
     */
    @java.lang.Override
    public int getPageId() {
      return pageId_;
    }

    public static final int WORDID_FIELD_NUMBER = 9;
    private int wordId_;
    /**
     * <code>uint32 wordId = 9;</code>
     * @return The wordId.
     */
    @java.lang.Override
    public int getWordId() {
      return wordId_;
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
      if (wordId_ != 0) {
        output.writeUInt32(9, wordId_);
      }
      if (pageId_ != 0) {
        output.writeUInt32(13, pageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (wordId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, wordId_);
      }
      if (pageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, pageId_);
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
      if (!(obj instanceof SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq)) {
        return super.equals(obj);
      }
      SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq other = (SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq) obj;

      if (getPageId()
          != other.getPageId()) return false;
      if (getWordId()
          != other.getWordId()) return false;
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
      hash = (37 * hash) + PAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getPageId();
      hash = (37 * hash) + WORDID_FIELD_NUMBER;
      hash = (53 * hash) + getWordId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq parseFrom(
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
    public static Builder newBuilder(SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq prototype) {
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
     * Protobuf type {@code SubmitInferenceWordReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SubmitInferenceWordReq)
        SubmitInferenceWordReqOuterClass.SubmitInferenceWordReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SubmitInferenceWordReqOuterClass.internal_static_SubmitInferenceWordReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SubmitInferenceWordReqOuterClass.internal_static_SubmitInferenceWordReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq.class, SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq.Builder.class);
      }

      // Construct using SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq.newBuilder()
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
        pageId_ = 0;

        wordId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SubmitInferenceWordReqOuterClass.internal_static_SubmitInferenceWordReq_descriptor;
      }

      @java.lang.Override
      public SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq getDefaultInstanceForType() {
        return SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq.getDefaultInstance();
      }

      @java.lang.Override
      public SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq build() {
        SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq buildPartial() {
        SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq result = new SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq(this);
        result.pageId_ = pageId_;
        result.wordId_ = wordId_;
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
        if (other instanceof SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq) {
          return mergeFrom((SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq other) {
        if (other == SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq.getDefaultInstance()) return this;
        if (other.getPageId() != 0) {
          setPageId(other.getPageId());
        }
        if (other.getWordId() != 0) {
          setWordId(other.getWordId());
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
        SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int pageId_ ;
      /**
       * <code>uint32 pageId = 13;</code>
       * @return The pageId.
       */
      @java.lang.Override
      public int getPageId() {
        return pageId_;
      }
      /**
       * <code>uint32 pageId = 13;</code>
       * @param value The pageId to set.
       * @return This builder for chaining.
       */
      public Builder setPageId(int value) {
        
        pageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pageId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearPageId() {
        
        pageId_ = 0;
        onChanged();
        return this;
      }

      private int wordId_ ;
      /**
       * <code>uint32 wordId = 9;</code>
       * @return The wordId.
       */
      @java.lang.Override
      public int getWordId() {
        return wordId_;
      }
      /**
       * <code>uint32 wordId = 9;</code>
       * @param value The wordId to set.
       * @return This builder for chaining.
       */
      public Builder setWordId(int value) {
        
        wordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wordId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearWordId() {
        
        wordId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SubmitInferenceWordReq)
    }

    // @@protoc_insertion_point(class_scope:SubmitInferenceWordReq)
    private static final SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq();
    }

    public static SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SubmitInferenceWordReq>
        PARSER = new com.google.protobuf.AbstractParser<SubmitInferenceWordReq>() {
      @java.lang.Override
      public SubmitInferenceWordReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SubmitInferenceWordReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SubmitInferenceWordReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubmitInferenceWordReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SubmitInferenceWordReqOuterClass.SubmitInferenceWordReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SubmitInferenceWordReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SubmitInferenceWordReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SubmitInferenceWordReq.proto\"\232\001\n\026Submi" +
      "tInferenceWordReq\022\016\n\006pageId\030\r \001(\r\022\016\n\006wor" +
      "dId\030\t \001(\r\"`\n\013MBJGANFDAIG\022\010\n\004NONE\020\000\022\020\n\013PE" +
      "PPOHPHJOJ\020\306\003\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLM" +
      "POEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SubmitInferenceWordReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SubmitInferenceWordReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SubmitInferenceWordReq_descriptor,
        new java.lang.String[] { "PageId", "WordId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
