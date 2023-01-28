// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DuelHeartCgEndNotify.proto

public final class DuelHeartCgEndNotifyOuterClass {
  private DuelHeartCgEndNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DuelHeartCgEndNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DuelHeartCgEndNotify)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code DuelHeartCgEndNotify}
   */
  public static final class DuelHeartCgEndNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DuelHeartCgEndNotify)
      DuelHeartCgEndNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DuelHeartCgEndNotify.newBuilder() to construct.
    private DuelHeartCgEndNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DuelHeartCgEndNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DuelHeartCgEndNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DuelHeartCgEndNotify(
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
      return DuelHeartCgEndNotifyOuterClass.internal_static_DuelHeartCgEndNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DuelHeartCgEndNotifyOuterClass.internal_static_DuelHeartCgEndNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify.class, DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code DuelHeartCgEndNotify.ACIAFBKGECB}
     */
    public enum ACIAFBKGECB
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 20166;</code>
       */
      PEPPOHPHJOJ(1, 20166),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final ACIAFBKGECB DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final ACIAFBKGECB EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 20166;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 20166;
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
      public static ACIAFBKGECB valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static ACIAFBKGECB forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 20166: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ACIAFBKGECB>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ACIAFBKGECB> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ACIAFBKGECB>() {
              public ACIAFBKGECB findValueByNumber(int number) {
                return ACIAFBKGECB.forNumber(number);
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
        return DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final ACIAFBKGECB[] VALUES = getStaticValuesArray();
      private static ACIAFBKGECB[] getStaticValuesArray() {
        return new ACIAFBKGECB[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static ACIAFBKGECB valueOf(
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

      private ACIAFBKGECB(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:DuelHeartCgEndNotify.ACIAFBKGECB)
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify)) {
        return super.equals(obj);
      }
      DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify other = (DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify parseFrom(
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
    public static Builder newBuilder(DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify prototype) {
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
     * Protobuf type {@code DuelHeartCgEndNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DuelHeartCgEndNotify)
        DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return DuelHeartCgEndNotifyOuterClass.internal_static_DuelHeartCgEndNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return DuelHeartCgEndNotifyOuterClass.internal_static_DuelHeartCgEndNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify.class, DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify.Builder.class);
      }

      // Construct using DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DuelHeartCgEndNotifyOuterClass.internal_static_DuelHeartCgEndNotify_descriptor;
      }

      @java.lang.Override
      public DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify getDefaultInstanceForType() {
        return DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify.getDefaultInstance();
      }

      @java.lang.Override
      public DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify build() {
        DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify buildPartial() {
        DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify result = new DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify(this);
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
        if (other instanceof DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify) {
          return mergeFrom((DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify other) {
        if (other == DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify.getDefaultInstance()) return this;
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
        DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:DuelHeartCgEndNotify)
    }

    // @@protoc_insertion_point(class_scope:DuelHeartCgEndNotify)
    private static final DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify();
    }

    public static DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DuelHeartCgEndNotify>
        PARSER = new com.google.protobuf.AbstractParser<DuelHeartCgEndNotify>() {
      @java.lang.Override
      public DuelHeartCgEndNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DuelHeartCgEndNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DuelHeartCgEndNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DuelHeartCgEndNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public DuelHeartCgEndNotifyOuterClass.DuelHeartCgEndNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DuelHeartCgEndNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DuelHeartCgEndNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032DuelHeartCgEndNotify.proto\"y\n\024DuelHear" +
      "tCgEndNotify\"a\n\013ACIAFBKGECB\022\010\n\004NONE\020\000\022\021\n" +
      "\013PEPPOHPHJOJ\020\306\235\001\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNB" +
      "KOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DuelHeartCgEndNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DuelHeartCgEndNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DuelHeartCgEndNotify_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
