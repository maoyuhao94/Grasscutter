// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3300_DGBNCDEIIFC.proto

public final class Unk3300DGBNCDEIIFC {
  private Unk3300DGBNCDEIIFC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3300_DGBNCDEIIFCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3300_DGBNCDEIIFC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 monsterIdList = 8;</code>
     * @return A list containing the monsterIdList.
     */
    java.util.List<java.lang.Integer> getMonsterIdListList();
    /**
     * <code>repeated uint32 monsterIdList = 8;</code>
     * @return The count of monsterIdList.
     */
    int getMonsterIdListCount();
    /**
     * <code>repeated uint32 monsterIdList = 8;</code>
     * @param index The index of the element to return.
     * @return The monsterIdList at the given index.
     */
    int getMonsterIdList(int index);

    /**
     * <code>repeated .PlatformType pgnajgkggih = 3;</code>
     * @return A list containing the pgnajgkggih.
     */
    java.util.List<PlatformTypeOuterClass.PlatformType> getPgnajgkggihList();
    /**
     * <code>repeated .PlatformType pgnajgkggih = 3;</code>
     * @return The count of pgnajgkggih.
     */
    int getPgnajgkggihCount();
    /**
     * <code>repeated .PlatformType pgnajgkggih = 3;</code>
     * @param index The index of the element to return.
     * @return The pgnajgkggih at the given index.
     */
    PlatformTypeOuterClass.PlatformType getPgnajgkggih(int index);
    /**
     * <code>repeated .PlatformType pgnajgkggih = 3;</code>
     * @return A list containing the enum numeric values on the wire for pgnajgkggih.
     */
    java.util.List<java.lang.Integer>
    getPgnajgkggihValueList();
    /**
     * <code>repeated .PlatformType pgnajgkggih = 3;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of pgnajgkggih at the given index.
     */
    int getPgnajgkggihValue(int index);
  }
  /**
   * Protobuf type {@code Unk3300_DGBNCDEIIFC}
   */
  public static final class Unk3300_DGBNCDEIIFC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3300_DGBNCDEIIFC)
      Unk3300_DGBNCDEIIFCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3300_DGBNCDEIIFC.newBuilder() to construct.
    private Unk3300_DGBNCDEIIFC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3300_DGBNCDEIIFC() {
      monsterIdList_ = emptyIntList();
      pgnajgkggih_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3300_DGBNCDEIIFC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3300_DGBNCDEIIFC(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 24: {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                pgnajgkggih_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              pgnajgkggih_.add(rawValue);
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                  pgnajgkggih_ = new java.util.ArrayList<java.lang.Integer>();
                  mutable_bitField0_ |= 0x00000002;
                }
                pgnajgkggih_.add(rawValue);
              }
              input.popLimit(oldLimit);
              break;
            }
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                monsterIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              monsterIdList_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                monsterIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                monsterIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          pgnajgkggih_ = java.util.Collections.unmodifiableList(pgnajgkggih_);
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          monsterIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Unk3300DGBNCDEIIFC.internal_static_Unk3300_DGBNCDEIIFC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Unk3300DGBNCDEIIFC.internal_static_Unk3300_DGBNCDEIIFC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC.class, Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC.Builder.class);
    }

    /**
     * Protobuf enum {@code Unk3300_DGBNCDEIIFC.NOBHCGGEENL}
     */
    public enum NOBHCGGEENL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 960;</code>
       */
      PEPPOHPHJOJ(1, 960),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final NOBHCGGEENL DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 960;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 960;
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
      public static NOBHCGGEENL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static NOBHCGGEENL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 960: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<NOBHCGGEENL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          NOBHCGGEENL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<NOBHCGGEENL>() {
              public NOBHCGGEENL findValueByNumber(int number) {
                return NOBHCGGEENL.forNumber(number);
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
        return Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC.getDescriptor().getEnumTypes().get(0);
      }

      private static final NOBHCGGEENL[] VALUES = getStaticValuesArray();
      private static NOBHCGGEENL[] getStaticValuesArray() {
        return new NOBHCGGEENL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static NOBHCGGEENL valueOf(
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

      private NOBHCGGEENL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Unk3300_DGBNCDEIIFC.NOBHCGGEENL)
    }

    public static final int MONSTERIDLIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList monsterIdList_;
    /**
     * <code>repeated uint32 monsterIdList = 8;</code>
     * @return A list containing the monsterIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMonsterIdListList() {
      return monsterIdList_;
    }
    /**
     * <code>repeated uint32 monsterIdList = 8;</code>
     * @return The count of monsterIdList.
     */
    public int getMonsterIdListCount() {
      return monsterIdList_.size();
    }
    /**
     * <code>repeated uint32 monsterIdList = 8;</code>
     * @param index The index of the element to return.
     * @return The monsterIdList at the given index.
     */
    public int getMonsterIdList(int index) {
      return monsterIdList_.getInt(index);
    }
    private int monsterIdListMemoizedSerializedSize = -1;

    public static final int PGNAJGKGGIH_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Integer> pgnajgkggih_;
    private static final com.google.protobuf.Internal.ListAdapter.Converter<
        java.lang.Integer, PlatformTypeOuterClass.PlatformType> pgnajgkggih_converter_ =
            new com.google.protobuf.Internal.ListAdapter.Converter<
                java.lang.Integer, PlatformTypeOuterClass.PlatformType>() {
              public PlatformTypeOuterClass.PlatformType convert(java.lang.Integer from) {
                @SuppressWarnings("deprecation")
                PlatformTypeOuterClass.PlatformType result = PlatformTypeOuterClass.PlatformType.valueOf(from);
                return result == null ? PlatformTypeOuterClass.PlatformType.UNRECOGNIZED : result;
              }
            };
    /**
     * <code>repeated .PlatformType pgnajgkggih = 3;</code>
     * @return A list containing the pgnajgkggih.
     */
    @java.lang.Override
    public java.util.List<PlatformTypeOuterClass.PlatformType> getPgnajgkggihList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, PlatformTypeOuterClass.PlatformType>(pgnajgkggih_, pgnajgkggih_converter_);
    }
    /**
     * <code>repeated .PlatformType pgnajgkggih = 3;</code>
     * @return The count of pgnajgkggih.
     */
    @java.lang.Override
    public int getPgnajgkggihCount() {
      return pgnajgkggih_.size();
    }
    /**
     * <code>repeated .PlatformType pgnajgkggih = 3;</code>
     * @param index The index of the element to return.
     * @return The pgnajgkggih at the given index.
     */
    @java.lang.Override
    public PlatformTypeOuterClass.PlatformType getPgnajgkggih(int index) {
      return pgnajgkggih_converter_.convert(pgnajgkggih_.get(index));
    }
    /**
     * <code>repeated .PlatformType pgnajgkggih = 3;</code>
     * @return A list containing the enum numeric values on the wire for pgnajgkggih.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
    getPgnajgkggihValueList() {
      return pgnajgkggih_;
    }
    /**
     * <code>repeated .PlatformType pgnajgkggih = 3;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of pgnajgkggih at the given index.
     */
    @java.lang.Override
    public int getPgnajgkggihValue(int index) {
      return pgnajgkggih_.get(index);
    }
    private int pgnajgkggihMemoizedSerializedSize;

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
      getSerializedSize();
      if (getPgnajgkggihList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(pgnajgkggihMemoizedSerializedSize);
      }
      for (int i = 0; i < pgnajgkggih_.size(); i++) {
        output.writeEnumNoTag(pgnajgkggih_.get(i));
      }
      if (getMonsterIdListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(monsterIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < monsterIdList_.size(); i++) {
        output.writeUInt32NoTag(monsterIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < pgnajgkggih_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(pgnajgkggih_.get(i));
        }
        size += dataSize;
        if (!getPgnajgkggihList().isEmpty()) {  size += 1;
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(dataSize);
        }pgnajgkggihMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < monsterIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(monsterIdList_.getInt(i));
        }
        size += dataSize;
        if (!getMonsterIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        monsterIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC)) {
        return super.equals(obj);
      }
      Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC other = (Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC) obj;

      if (!getMonsterIdListList()
          .equals(other.getMonsterIdListList())) return false;
      if (!pgnajgkggih_.equals(other.pgnajgkggih_)) return false;
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
      if (getMonsterIdListCount() > 0) {
        hash = (37 * hash) + MONSTERIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getMonsterIdListList().hashCode();
      }
      if (getPgnajgkggihCount() > 0) {
        hash = (37 * hash) + PGNAJGKGGIH_FIELD_NUMBER;
        hash = (53 * hash) + pgnajgkggih_.hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC parseFrom(
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
    public static Builder newBuilder(Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC prototype) {
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
     * Protobuf type {@code Unk3300_DGBNCDEIIFC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3300_DGBNCDEIIFC)
        Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Unk3300DGBNCDEIIFC.internal_static_Unk3300_DGBNCDEIIFC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Unk3300DGBNCDEIIFC.internal_static_Unk3300_DGBNCDEIIFC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC.class, Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC.Builder.class);
      }

      // Construct using Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC.newBuilder()
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
        monsterIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        pgnajgkggih_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Unk3300DGBNCDEIIFC.internal_static_Unk3300_DGBNCDEIIFC_descriptor;
      }

      @java.lang.Override
      public Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC getDefaultInstanceForType() {
        return Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC.getDefaultInstance();
      }

      @java.lang.Override
      public Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC build() {
        Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC buildPartial() {
        Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC result = new Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          monsterIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.monsterIdList_ = monsterIdList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          pgnajgkggih_ = java.util.Collections.unmodifiableList(pgnajgkggih_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.pgnajgkggih_ = pgnajgkggih_;
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
        if (other instanceof Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC) {
          return mergeFrom((Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC other) {
        if (other == Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC.getDefaultInstance()) return this;
        if (!other.monsterIdList_.isEmpty()) {
          if (monsterIdList_.isEmpty()) {
            monsterIdList_ = other.monsterIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMonsterIdListIsMutable();
            monsterIdList_.addAll(other.monsterIdList_);
          }
          onChanged();
        }
        if (!other.pgnajgkggih_.isEmpty()) {
          if (pgnajgkggih_.isEmpty()) {
            pgnajgkggih_ = other.pgnajgkggih_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePgnajgkggihIsMutable();
            pgnajgkggih_.addAll(other.pgnajgkggih_);
          }
          onChanged();
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
        Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList monsterIdList_ = emptyIntList();
      private void ensureMonsterIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          monsterIdList_ = mutableCopy(monsterIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 monsterIdList = 8;</code>
       * @return A list containing the monsterIdList.
       */
      public java.util.List<java.lang.Integer>
          getMonsterIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(monsterIdList_) : monsterIdList_;
      }
      /**
       * <code>repeated uint32 monsterIdList = 8;</code>
       * @return The count of monsterIdList.
       */
      public int getMonsterIdListCount() {
        return monsterIdList_.size();
      }
      /**
       * <code>repeated uint32 monsterIdList = 8;</code>
       * @param index The index of the element to return.
       * @return The monsterIdList at the given index.
       */
      public int getMonsterIdList(int index) {
        return monsterIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 monsterIdList = 8;</code>
       * @param index The index to set the value at.
       * @param value The monsterIdList to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterIdList(
          int index, int value) {
        ensureMonsterIdListIsMutable();
        monsterIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 monsterIdList = 8;</code>
       * @param value The monsterIdList to add.
       * @return This builder for chaining.
       */
      public Builder addMonsterIdList(int value) {
        ensureMonsterIdListIsMutable();
        monsterIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 monsterIdList = 8;</code>
       * @param values The monsterIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllMonsterIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMonsterIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, monsterIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 monsterIdList = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterIdList() {
        monsterIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> pgnajgkggih_ =
        java.util.Collections.emptyList();
      private void ensurePgnajgkggihIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          pgnajgkggih_ = new java.util.ArrayList<java.lang.Integer>(pgnajgkggih_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated .PlatformType pgnajgkggih = 3;</code>
       * @return A list containing the pgnajgkggih.
       */
      public java.util.List<PlatformTypeOuterClass.PlatformType> getPgnajgkggihList() {
        return new com.google.protobuf.Internal.ListAdapter<
            java.lang.Integer, PlatformTypeOuterClass.PlatformType>(pgnajgkggih_, pgnajgkggih_converter_);
      }
      /**
       * <code>repeated .PlatformType pgnajgkggih = 3;</code>
       * @return The count of pgnajgkggih.
       */
      public int getPgnajgkggihCount() {
        return pgnajgkggih_.size();
      }
      /**
       * <code>repeated .PlatformType pgnajgkggih = 3;</code>
       * @param index The index of the element to return.
       * @return The pgnajgkggih at the given index.
       */
      public PlatformTypeOuterClass.PlatformType getPgnajgkggih(int index) {
        return pgnajgkggih_converter_.convert(pgnajgkggih_.get(index));
      }
      /**
       * <code>repeated .PlatformType pgnajgkggih = 3;</code>
       * @param index The index to set the value at.
       * @param value The pgnajgkggih to set.
       * @return This builder for chaining.
       */
      public Builder setPgnajgkggih(
          int index, PlatformTypeOuterClass.PlatformType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePgnajgkggihIsMutable();
        pgnajgkggih_.set(index, value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .PlatformType pgnajgkggih = 3;</code>
       * @param value The pgnajgkggih to add.
       * @return This builder for chaining.
       */
      public Builder addPgnajgkggih(PlatformTypeOuterClass.PlatformType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePgnajgkggihIsMutable();
        pgnajgkggih_.add(value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .PlatformType pgnajgkggih = 3;</code>
       * @param values The pgnajgkggih to add.
       * @return This builder for chaining.
       */
      public Builder addAllPgnajgkggih(
          java.lang.Iterable<? extends PlatformTypeOuterClass.PlatformType> values) {
        ensurePgnajgkggihIsMutable();
        for (PlatformTypeOuterClass.PlatformType value : values) {
          pgnajgkggih_.add(value.getNumber());
        }
        onChanged();
        return this;
      }
      /**
       * <code>repeated .PlatformType pgnajgkggih = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPgnajgkggih() {
        pgnajgkggih_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .PlatformType pgnajgkggih = 3;</code>
       * @return A list containing the enum numeric values on the wire for pgnajgkggih.
       */
      public java.util.List<java.lang.Integer>
      getPgnajgkggihValueList() {
        return java.util.Collections.unmodifiableList(pgnajgkggih_);
      }
      /**
       * <code>repeated .PlatformType pgnajgkggih = 3;</code>
       * @param index The index of the value to return.
       * @return The enum numeric value on the wire of pgnajgkggih at the given index.
       */
      public int getPgnajgkggihValue(int index) {
        return pgnajgkggih_.get(index);
      }
      /**
       * <code>repeated .PlatformType pgnajgkggih = 3;</code>
       * @param index The index of the value to return.
       * @return The enum numeric value on the wire of pgnajgkggih at the given index.
       * @return This builder for chaining.
       */
      public Builder setPgnajgkggihValue(
          int index, int value) {
        ensurePgnajgkggihIsMutable();
        pgnajgkggih_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .PlatformType pgnajgkggih = 3;</code>
       * @param value The enum numeric value on the wire for pgnajgkggih to add.
       * @return This builder for chaining.
       */
      public Builder addPgnajgkggihValue(int value) {
        ensurePgnajgkggihIsMutable();
        pgnajgkggih_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .PlatformType pgnajgkggih = 3;</code>
       * @param values The enum numeric values on the wire for pgnajgkggih to add.
       * @return This builder for chaining.
       */
      public Builder addAllPgnajgkggihValue(
          java.lang.Iterable<java.lang.Integer> values) {
        ensurePgnajgkggihIsMutable();
        for (int value : values) {
          pgnajgkggih_.add(value);
        }
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


      // @@protoc_insertion_point(builder_scope:Unk3300_DGBNCDEIIFC)
    }

    // @@protoc_insertion_point(class_scope:Unk3300_DGBNCDEIIFC)
    private static final Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC();
    }

    public static Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3300_DGBNCDEIIFC>
        PARSER = new com.google.protobuf.AbstractParser<Unk3300_DGBNCDEIIFC>() {
      @java.lang.Override
      public Unk3300_DGBNCDEIIFC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3300_DGBNCDEIIFC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3300_DGBNCDEIIFC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3300_DGBNCDEIIFC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Unk3300DGBNCDEIIFC.Unk3300_DGBNCDEIIFC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3300_DGBNCDEIIFC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3300_DGBNCDEIIFC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3300_DGBNCDEIIFC.proto\032\022PlatformTyp" +
      "e.proto\"\241\001\n\023Unk3300_DGBNCDEIIFC\022\025\n\rmonst" +
      "erIdList\030\010 \003(\r\022\"\n\013pgnajgkggih\030\003 \003(\0162\r.Pl" +
      "atformType\"O\n\013NOBHCGGEENL\022\010\n\004NONE\020\000\022\020\n\013P" +
      "EPPOHPHJOJ\020\300\007\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOL" +
      "MPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          PlatformTypeOuterClass.getDescriptor(),
        });
    internal_static_Unk3300_DGBNCDEIIFC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3300_DGBNCDEIIFC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3300_DGBNCDEIIFC_descriptor,
        new java.lang.String[] { "MonsterIdList", "Pgnajgkggih", });
    PlatformTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
