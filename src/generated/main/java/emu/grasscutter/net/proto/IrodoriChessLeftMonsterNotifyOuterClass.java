// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessLeftMonsterNotify.proto

public final class IrodoriChessLeftMonsterNotifyOuterClass {
  private IrodoriChessLeftMonsterNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessLeftMonsterNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessLeftMonsterNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 leftMonsters = 6;</code>
     * @return The leftMonsters.
     */
    int getLeftMonsters();
  }
  /**
   * Protobuf type {@code IrodoriChessLeftMonsterNotify}
   */
  public static final class IrodoriChessLeftMonsterNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessLeftMonsterNotify)
      IrodoriChessLeftMonsterNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessLeftMonsterNotify.newBuilder() to construct.
    private IrodoriChessLeftMonsterNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessLeftMonsterNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessLeftMonsterNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IrodoriChessLeftMonsterNotify(
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
            case 48: {

              leftMonsters_ = input.readUInt32();
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
      return IrodoriChessLeftMonsterNotifyOuterClass.internal_static_IrodoriChessLeftMonsterNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return IrodoriChessLeftMonsterNotifyOuterClass.internal_static_IrodoriChessLeftMonsterNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.class, IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code IrodoriChessLeftMonsterNotify.OEENJIIIDPF}
     */
    public enum OEENJIIIDPF
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 5340;</code>
       */
      PEPPOHPHJOJ(1, 5340),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final OEENJIIIDPF DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 5340;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 5340;
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
      public static OEENJIIIDPF valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static OEENJIIIDPF forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 5340: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<OEENJIIIDPF>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          OEENJIIIDPF> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<OEENJIIIDPF>() {
              public OEENJIIIDPF findValueByNumber(int number) {
                return OEENJIIIDPF.forNumber(number);
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
        return IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final OEENJIIIDPF[] VALUES = getStaticValuesArray();
      private static OEENJIIIDPF[] getStaticValuesArray() {
        return new OEENJIIIDPF[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static OEENJIIIDPF valueOf(
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

      private OEENJIIIDPF(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:IrodoriChessLeftMonsterNotify.OEENJIIIDPF)
    }

    public static final int LEFTMONSTERS_FIELD_NUMBER = 6;
    private int leftMonsters_;
    /**
     * <code>uint32 leftMonsters = 6;</code>
     * @return The leftMonsters.
     */
    @java.lang.Override
    public int getLeftMonsters() {
      return leftMonsters_;
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
      if (leftMonsters_ != 0) {
        output.writeUInt32(6, leftMonsters_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (leftMonsters_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, leftMonsters_);
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
      if (!(obj instanceof IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify)) {
        return super.equals(obj);
      }
      IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify other = (IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify) obj;

      if (getLeftMonsters()
          != other.getLeftMonsters()) return false;
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
      hash = (37 * hash) + LEFTMONSTERS_FIELD_NUMBER;
      hash = (53 * hash) + getLeftMonsters();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
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
    public static Builder newBuilder(IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify prototype) {
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
     * Protobuf type {@code IrodoriChessLeftMonsterNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessLeftMonsterNotify)
        IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return IrodoriChessLeftMonsterNotifyOuterClass.internal_static_IrodoriChessLeftMonsterNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return IrodoriChessLeftMonsterNotifyOuterClass.internal_static_IrodoriChessLeftMonsterNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.class, IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.Builder.class);
      }

      // Construct using IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.newBuilder()
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
        leftMonsters_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return IrodoriChessLeftMonsterNotifyOuterClass.internal_static_IrodoriChessLeftMonsterNotify_descriptor;
      }

      @java.lang.Override
      public IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify getDefaultInstanceForType() {
        return IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.getDefaultInstance();
      }

      @java.lang.Override
      public IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify build() {
        IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify buildPartial() {
        IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify result = new IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify(this);
        result.leftMonsters_ = leftMonsters_;
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
        if (other instanceof IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify) {
          return mergeFrom((IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify other) {
        if (other == IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.getDefaultInstance()) return this;
        if (other.getLeftMonsters() != 0) {
          setLeftMonsters(other.getLeftMonsters());
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
        IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int leftMonsters_ ;
      /**
       * <code>uint32 leftMonsters = 6;</code>
       * @return The leftMonsters.
       */
      @java.lang.Override
      public int getLeftMonsters() {
        return leftMonsters_;
      }
      /**
       * <code>uint32 leftMonsters = 6;</code>
       * @param value The leftMonsters to set.
       * @return This builder for chaining.
       */
      public Builder setLeftMonsters(int value) {
        
        leftMonsters_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 leftMonsters = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftMonsters() {
        
        leftMonsters_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessLeftMonsterNotify)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessLeftMonsterNotify)
    private static final IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify();
    }

    public static IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessLeftMonsterNotify>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessLeftMonsterNotify>() {
      @java.lang.Override
      public IrodoriChessLeftMonsterNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IrodoriChessLeftMonsterNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IrodoriChessLeftMonsterNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessLeftMonsterNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessLeftMonsterNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessLeftMonsterNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#IrodoriChessLeftMonsterNotify.proto\"\206\001" +
      "\n\035IrodoriChessLeftMonsterNotify\022\024\n\014leftM" +
      "onsters\030\006 \001(\r\"O\n\013OEENJIIIDPF\022\010\n\004NONE\020\000\022\020" +
      "\n\013PEPPOHPHJOJ\020\334)\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNB" +
      "KOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IrodoriChessLeftMonsterNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessLeftMonsterNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessLeftMonsterNotify_descriptor,
        new java.lang.String[] { "LeftMonsters", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
