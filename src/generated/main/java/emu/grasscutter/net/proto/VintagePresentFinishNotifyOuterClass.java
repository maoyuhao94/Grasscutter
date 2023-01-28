// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintagePresentFinishNotify.proto

public final class VintagePresentFinishNotifyOuterClass {
  private VintagePresentFinishNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintagePresentFinishNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintagePresentFinishNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 presentId = 4;</code>
     * @return The presentId.
     */
    int getPresentId();
  }
  /**
   * Protobuf type {@code VintagePresentFinishNotify}
   */
  public static final class VintagePresentFinishNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintagePresentFinishNotify)
      VintagePresentFinishNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintagePresentFinishNotify.newBuilder() to construct.
    private VintagePresentFinishNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintagePresentFinishNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintagePresentFinishNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintagePresentFinishNotify(
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

              presentId_ = input.readUInt32();
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
      return VintagePresentFinishNotifyOuterClass.internal_static_VintagePresentFinishNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return VintagePresentFinishNotifyOuterClass.internal_static_VintagePresentFinishNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify.class, VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code VintagePresentFinishNotify.OJKNNANBCBE}
     */
    public enum OJKNNANBCBE
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 23457;</code>
       */
      PEPPOHPHJOJ(1, 23457),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final OJKNNANBCBE DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 23457;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 23457;
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
      public static OJKNNANBCBE valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static OJKNNANBCBE forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 23457: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<OJKNNANBCBE>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          OJKNNANBCBE> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<OJKNNANBCBE>() {
              public OJKNNANBCBE findValueByNumber(int number) {
                return OJKNNANBCBE.forNumber(number);
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
        return VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final OJKNNANBCBE[] VALUES = getStaticValuesArray();
      private static OJKNNANBCBE[] getStaticValuesArray() {
        return new OJKNNANBCBE[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static OJKNNANBCBE valueOf(
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

      private OJKNNANBCBE(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:VintagePresentFinishNotify.OJKNNANBCBE)
    }

    public static final int PRESENTID_FIELD_NUMBER = 4;
    private int presentId_;
    /**
     * <code>uint32 presentId = 4;</code>
     * @return The presentId.
     */
    @java.lang.Override
    public int getPresentId() {
      return presentId_;
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
      if (presentId_ != 0) {
        output.writeUInt32(4, presentId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (presentId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, presentId_);
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
      if (!(obj instanceof VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify)) {
        return super.equals(obj);
      }
      VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify other = (VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify) obj;

      if (getPresentId()
          != other.getPresentId()) return false;
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
      hash = (37 * hash) + PRESENTID_FIELD_NUMBER;
      hash = (53 * hash) + getPresentId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify parseFrom(
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
    public static Builder newBuilder(VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify prototype) {
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
     * Protobuf type {@code VintagePresentFinishNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintagePresentFinishNotify)
        VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return VintagePresentFinishNotifyOuterClass.internal_static_VintagePresentFinishNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return VintagePresentFinishNotifyOuterClass.internal_static_VintagePresentFinishNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify.class, VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify.Builder.class);
      }

      // Construct using VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify.newBuilder()
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
        presentId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return VintagePresentFinishNotifyOuterClass.internal_static_VintagePresentFinishNotify_descriptor;
      }

      @java.lang.Override
      public VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify getDefaultInstanceForType() {
        return VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify.getDefaultInstance();
      }

      @java.lang.Override
      public VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify build() {
        VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify buildPartial() {
        VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify result = new VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify(this);
        result.presentId_ = presentId_;
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
        if (other instanceof VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify) {
          return mergeFrom((VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify other) {
        if (other == VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify.getDefaultInstance()) return this;
        if (other.getPresentId() != 0) {
          setPresentId(other.getPresentId());
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
        VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int presentId_ ;
      /**
       * <code>uint32 presentId = 4;</code>
       * @return The presentId.
       */
      @java.lang.Override
      public int getPresentId() {
        return presentId_;
      }
      /**
       * <code>uint32 presentId = 4;</code>
       * @param value The presentId to set.
       * @return This builder for chaining.
       */
      public Builder setPresentId(int value) {
        
        presentId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 presentId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPresentId() {
        
        presentId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:VintagePresentFinishNotify)
    }

    // @@protoc_insertion_point(class_scope:VintagePresentFinishNotify)
    private static final VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify();
    }

    public static VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintagePresentFinishNotify>
        PARSER = new com.google.protobuf.AbstractParser<VintagePresentFinishNotify>() {
      @java.lang.Override
      public VintagePresentFinishNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintagePresentFinishNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintagePresentFinishNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintagePresentFinishNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public VintagePresentFinishNotifyOuterClass.VintagePresentFinishNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintagePresentFinishNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintagePresentFinishNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n VintagePresentFinishNotify.proto\"\201\001\n\032V" +
      "intagePresentFinishNotify\022\021\n\tpresentId\030\004" +
      " \001(\r\"P\n\013OJKNNANBCBE\022\010\n\004NONE\020\000\022\021\n\013PEPPOHP" +
      "HJOJ\020\241\267\001\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA" +
      "\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintagePresentFinishNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintagePresentFinishNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintagePresentFinishNotify_descriptor,
        new java.lang.String[] { "PresentId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
