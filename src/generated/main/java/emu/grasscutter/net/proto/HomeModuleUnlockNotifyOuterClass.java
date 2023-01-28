// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeModuleUnlockNotify.proto

public final class HomeModuleUnlockNotifyOuterClass {
  private HomeModuleUnlockNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeModuleUnlockNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeModuleUnlockNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 moduleId = 14;</code>
     * @return The moduleId.
     */
    int getModuleId();
  }
  /**
   * Protobuf type {@code HomeModuleUnlockNotify}
   */
  public static final class HomeModuleUnlockNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeModuleUnlockNotify)
      HomeModuleUnlockNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeModuleUnlockNotify.newBuilder() to construct.
    private HomeModuleUnlockNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeModuleUnlockNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeModuleUnlockNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeModuleUnlockNotify(
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
            case 112: {

              moduleId_ = input.readUInt32();
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
      return HomeModuleUnlockNotifyOuterClass.internal_static_HomeModuleUnlockNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HomeModuleUnlockNotifyOuterClass.internal_static_HomeModuleUnlockNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify.class, HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code HomeModuleUnlockNotify.NLKMOKOLLKG}
     */
    public enum NLKMOKOLLKG
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4528;</code>
       */
      PEPPOHPHJOJ(1, 4528),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final NLKMOKOLLKG DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4528;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4528;
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
      public static NLKMOKOLLKG valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static NLKMOKOLLKG forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4528: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<NLKMOKOLLKG>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          NLKMOKOLLKG> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<NLKMOKOLLKG>() {
              public NLKMOKOLLKG findValueByNumber(int number) {
                return NLKMOKOLLKG.forNumber(number);
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
        return HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final NLKMOKOLLKG[] VALUES = getStaticValuesArray();
      private static NLKMOKOLLKG[] getStaticValuesArray() {
        return new NLKMOKOLLKG[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static NLKMOKOLLKG valueOf(
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

      private NLKMOKOLLKG(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:HomeModuleUnlockNotify.NLKMOKOLLKG)
    }

    public static final int MODULEID_FIELD_NUMBER = 14;
    private int moduleId_;
    /**
     * <code>uint32 moduleId = 14;</code>
     * @return The moduleId.
     */
    @java.lang.Override
    public int getModuleId() {
      return moduleId_;
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
      if (moduleId_ != 0) {
        output.writeUInt32(14, moduleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (moduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, moduleId_);
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
      if (!(obj instanceof HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify)) {
        return super.equals(obj);
      }
      HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify other = (HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify) obj;

      if (getModuleId()
          != other.getModuleId()) return false;
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
      hash = (37 * hash) + MODULEID_FIELD_NUMBER;
      hash = (53 * hash) + getModuleId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify parseFrom(
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
    public static Builder newBuilder(HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify prototype) {
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
     * Protobuf type {@code HomeModuleUnlockNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeModuleUnlockNotify)
        HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HomeModuleUnlockNotifyOuterClass.internal_static_HomeModuleUnlockNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HomeModuleUnlockNotifyOuterClass.internal_static_HomeModuleUnlockNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify.class, HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify.Builder.class);
      }

      // Construct using HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify.newBuilder()
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
        moduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HomeModuleUnlockNotifyOuterClass.internal_static_HomeModuleUnlockNotify_descriptor;
      }

      @java.lang.Override
      public HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify getDefaultInstanceForType() {
        return HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify.getDefaultInstance();
      }

      @java.lang.Override
      public HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify build() {
        HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify buildPartial() {
        HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify result = new HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify(this);
        result.moduleId_ = moduleId_;
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
        if (other instanceof HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify) {
          return mergeFrom((HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify other) {
        if (other == HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify.getDefaultInstance()) return this;
        if (other.getModuleId() != 0) {
          setModuleId(other.getModuleId());
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
        HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int moduleId_ ;
      /**
       * <code>uint32 moduleId = 14;</code>
       * @return The moduleId.
       */
      @java.lang.Override
      public int getModuleId() {
        return moduleId_;
      }
      /**
       * <code>uint32 moduleId = 14;</code>
       * @param value The moduleId to set.
       * @return This builder for chaining.
       */
      public Builder setModuleId(int value) {
        
        moduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 moduleId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearModuleId() {
        
        moduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeModuleUnlockNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeModuleUnlockNotify)
    private static final HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify();
    }

    public static HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeModuleUnlockNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeModuleUnlockNotify>() {
      @java.lang.Override
      public HomeModuleUnlockNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeModuleUnlockNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeModuleUnlockNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeModuleUnlockNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeModuleUnlockNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeModuleUnlockNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034HomeModuleUnlockNotify.proto\"{\n\026HomeMo" +
      "duleUnlockNotify\022\020\n\010moduleId\030\016 \001(\r\"O\n\013NL" +
      "KMOKOLLKG\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\260#\022\017\n" +
      "\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeModuleUnlockNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeModuleUnlockNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeModuleUnlockNotify_descriptor,
        new java.lang.String[] { "ModuleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
