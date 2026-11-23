/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim.impl;

import java.util.Collection;

import org.dmtf.cim.CIM_DMA;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM DMA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DMAImpl#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DMAImpl#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DMAImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DMAImpl#getDMAChannel <em>DMA Channel</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DMAImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DMAImpl#getBurstMode <em>Burst Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DMAImpl#getTransferWidths <em>Transfer Widths</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DMAImpl#getAddressSize <em>Address Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DMAImpl#getMaxTransferSize <em>Max Transfer Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DMAImpl#getByteMode <em>Byte Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DMAImpl#getWordMode <em>Word Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DMAImpl#getChannelTiming <em>Channel Timing</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DMAImpl#getTypeCTiming <em>Type CTiming</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DMAImpl extends CIM_SystemResourceImpl implements CIM_DMA {
	/**
	 * The default value of the '{@link #getCSCreationClassName() <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSCreationClassName() <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String csCreationClassName = CS_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCSName() <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSName() <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSName()
	 * @generated
	 * @ordered
	 */
	protected String csName = CS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDMAChannel() <em>DMA Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMAChannel()
	 * @generated
	 * @ordered
	 */
	protected static final Long DMA_CHANNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDMAChannel() <em>DMA Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMAChannel()
	 * @generated
	 * @ordered
	 */
	protected Long dmaChannel = DMA_CHANNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AVAILABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected Integer availability = AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBurstMode() <em>Burst Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstMode()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BURST_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBurstMode() <em>Burst Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstMode()
	 * @generated
	 * @ordered
	 */
	protected Boolean burstMode = BURST_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransferWidths() <em>Transfer Widths</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferWidths()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> transferWidths;

	/**
	 * The default value of the '{@link #getAddressSize() <em>Address Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDRESS_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressSize() <em>Address Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSize()
	 * @generated
	 * @ordered
	 */
	protected Integer addressSize = ADDRESS_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTransferSize() <em>Max Transfer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTransferSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_TRANSFER_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxTransferSize() <em>Max Transfer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTransferSize()
	 * @generated
	 * @ordered
	 */
	protected Long maxTransferSize = MAX_TRANSFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getByteMode() <em>Byte Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BYTE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByteMode() <em>Byte Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteMode()
	 * @generated
	 * @ordered
	 */
	protected Integer byteMode = BYTE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWordMode() <em>Word Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WORD_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWordMode() <em>Word Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordMode()
	 * @generated
	 * @ordered
	 */
	protected Integer wordMode = WORD_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannelTiming() <em>Channel Timing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelTiming()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHANNEL_TIMING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannelTiming() <em>Channel Timing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelTiming()
	 * @generated
	 * @ordered
	 */
	protected Integer channelTiming = CHANNEL_TIMING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeCTiming() <em>Type CTiming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCTiming()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_CTIMING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeCTiming() <em>Type CTiming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCTiming()
	 * @generated
	 * @ordered
	 */
	protected Integer typeCTiming = TYPE_CTIMING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DMAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DMA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCSCreationClassName() {
		return csCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCSCreationClassName(String newCSCreationClassName) {
		String oldCSCreationClassName = csCreationClassName;
		csCreationClassName = newCSCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DMA__CS_CREATION_CLASS_NAME, oldCSCreationClassName, csCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCSName() {
		return csName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCSName(String newCSName) {
		String oldCSName = csName;
		csName = newCSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DMA__CS_NAME, oldCSName, csName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DMA__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDMAChannel() {
		return dmaChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDMAChannel(Long newDMAChannel) {
		Long oldDMAChannel = dmaChannel;
		dmaChannel = newDMAChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DMA__DMA_CHANNEL, oldDMAChannel, dmaChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailability(Integer newAvailability) {
		Integer oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DMA__AVAILABILITY, oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getBurstMode() {
		return burstMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBurstMode(Boolean newBurstMode) {
		Boolean oldBurstMode = burstMode;
		burstMode = newBurstMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DMA__BURST_MODE, oldBurstMode, burstMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getTransferWidths() {
		if (transferWidths == null) {
			transferWidths = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DMA__TRANSFER_WIDTHS);
		}
		return transferWidths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAddressSize() {
		return addressSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressSize(Integer newAddressSize) {
		Integer oldAddressSize = addressSize;
		addressSize = newAddressSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DMA__ADDRESS_SIZE, oldAddressSize, addressSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxTransferSize() {
		return maxTransferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTransferSize(Long newMaxTransferSize) {
		Long oldMaxTransferSize = maxTransferSize;
		maxTransferSize = newMaxTransferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DMA__MAX_TRANSFER_SIZE, oldMaxTransferSize, maxTransferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getByteMode() {
		return byteMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByteMode(Integer newByteMode) {
		Integer oldByteMode = byteMode;
		byteMode = newByteMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DMA__BYTE_MODE, oldByteMode, byteMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getWordMode() {
		return wordMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWordMode(Integer newWordMode) {
		Integer oldWordMode = wordMode;
		wordMode = newWordMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DMA__WORD_MODE, oldWordMode, wordMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getChannelTiming() {
		return channelTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannelTiming(Integer newChannelTiming) {
		Integer oldChannelTiming = channelTiming;
		channelTiming = newChannelTiming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DMA__CHANNEL_TIMING, oldChannelTiming, channelTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTypeCTiming() {
		return typeCTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeCTiming(Integer newTypeCTiming) {
		Integer oldTypeCTiming = typeCTiming;
		typeCTiming = newTypeCTiming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DMA__TYPE_CTIMING, oldTypeCTiming, typeCTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DMA__CS_CREATION_CLASS_NAME:
				return getCSCreationClassName();
			case CimPackage.CIM_DMA__CS_NAME:
				return getCSName();
			case CimPackage.CIM_DMA__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_DMA__DMA_CHANNEL:
				return getDMAChannel();
			case CimPackage.CIM_DMA__AVAILABILITY:
				return getAvailability();
			case CimPackage.CIM_DMA__BURST_MODE:
				return getBurstMode();
			case CimPackage.CIM_DMA__TRANSFER_WIDTHS:
				return getTransferWidths();
			case CimPackage.CIM_DMA__ADDRESS_SIZE:
				return getAddressSize();
			case CimPackage.CIM_DMA__MAX_TRANSFER_SIZE:
				return getMaxTransferSize();
			case CimPackage.CIM_DMA__BYTE_MODE:
				return getByteMode();
			case CimPackage.CIM_DMA__WORD_MODE:
				return getWordMode();
			case CimPackage.CIM_DMA__CHANNEL_TIMING:
				return getChannelTiming();
			case CimPackage.CIM_DMA__TYPE_CTIMING:
				return getTypeCTiming();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_DMA__CS_CREATION_CLASS_NAME:
				setCSCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_DMA__CS_NAME:
				setCSName((String)newValue);
				return;
			case CimPackage.CIM_DMA__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_DMA__DMA_CHANNEL:
				setDMAChannel((Long)newValue);
				return;
			case CimPackage.CIM_DMA__AVAILABILITY:
				setAvailability((Integer)newValue);
				return;
			case CimPackage.CIM_DMA__BURST_MODE:
				setBurstMode((Boolean)newValue);
				return;
			case CimPackage.CIM_DMA__TRANSFER_WIDTHS:
				getTransferWidths().clear();
				getTransferWidths().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DMA__ADDRESS_SIZE:
				setAddressSize((Integer)newValue);
				return;
			case CimPackage.CIM_DMA__MAX_TRANSFER_SIZE:
				setMaxTransferSize((Long)newValue);
				return;
			case CimPackage.CIM_DMA__BYTE_MODE:
				setByteMode((Integer)newValue);
				return;
			case CimPackage.CIM_DMA__WORD_MODE:
				setWordMode((Integer)newValue);
				return;
			case CimPackage.CIM_DMA__CHANNEL_TIMING:
				setChannelTiming((Integer)newValue);
				return;
			case CimPackage.CIM_DMA__TYPE_CTIMING:
				setTypeCTiming((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_DMA__CS_CREATION_CLASS_NAME:
				setCSCreationClassName(CS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DMA__CS_NAME:
				setCSName(CS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DMA__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DMA__DMA_CHANNEL:
				setDMAChannel(DMA_CHANNEL_EDEFAULT);
				return;
			case CimPackage.CIM_DMA__AVAILABILITY:
				setAvailability(AVAILABILITY_EDEFAULT);
				return;
			case CimPackage.CIM_DMA__BURST_MODE:
				setBurstMode(BURST_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_DMA__TRANSFER_WIDTHS:
				getTransferWidths().clear();
				return;
			case CimPackage.CIM_DMA__ADDRESS_SIZE:
				setAddressSize(ADDRESS_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_DMA__MAX_TRANSFER_SIZE:
				setMaxTransferSize(MAX_TRANSFER_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_DMA__BYTE_MODE:
				setByteMode(BYTE_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_DMA__WORD_MODE:
				setWordMode(WORD_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_DMA__CHANNEL_TIMING:
				setChannelTiming(CHANNEL_TIMING_EDEFAULT);
				return;
			case CimPackage.CIM_DMA__TYPE_CTIMING:
				setTypeCTiming(TYPE_CTIMING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_DMA__CS_CREATION_CLASS_NAME:
				return CS_CREATION_CLASS_NAME_EDEFAULT == null ? csCreationClassName != null : !CS_CREATION_CLASS_NAME_EDEFAULT.equals(csCreationClassName);
			case CimPackage.CIM_DMA__CS_NAME:
				return CS_NAME_EDEFAULT == null ? csName != null : !CS_NAME_EDEFAULT.equals(csName);
			case CimPackage.CIM_DMA__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_DMA__DMA_CHANNEL:
				return DMA_CHANNEL_EDEFAULT == null ? dmaChannel != null : !DMA_CHANNEL_EDEFAULT.equals(dmaChannel);
			case CimPackage.CIM_DMA__AVAILABILITY:
				return AVAILABILITY_EDEFAULT == null ? availability != null : !AVAILABILITY_EDEFAULT.equals(availability);
			case CimPackage.CIM_DMA__BURST_MODE:
				return BURST_MODE_EDEFAULT == null ? burstMode != null : !BURST_MODE_EDEFAULT.equals(burstMode);
			case CimPackage.CIM_DMA__TRANSFER_WIDTHS:
				return transferWidths != null && !transferWidths.isEmpty();
			case CimPackage.CIM_DMA__ADDRESS_SIZE:
				return ADDRESS_SIZE_EDEFAULT == null ? addressSize != null : !ADDRESS_SIZE_EDEFAULT.equals(addressSize);
			case CimPackage.CIM_DMA__MAX_TRANSFER_SIZE:
				return MAX_TRANSFER_SIZE_EDEFAULT == null ? maxTransferSize != null : !MAX_TRANSFER_SIZE_EDEFAULT.equals(maxTransferSize);
			case CimPackage.CIM_DMA__BYTE_MODE:
				return BYTE_MODE_EDEFAULT == null ? byteMode != null : !BYTE_MODE_EDEFAULT.equals(byteMode);
			case CimPackage.CIM_DMA__WORD_MODE:
				return WORD_MODE_EDEFAULT == null ? wordMode != null : !WORD_MODE_EDEFAULT.equals(wordMode);
			case CimPackage.CIM_DMA__CHANNEL_TIMING:
				return CHANNEL_TIMING_EDEFAULT == null ? channelTiming != null : !CHANNEL_TIMING_EDEFAULT.equals(channelTiming);
			case CimPackage.CIM_DMA__TYPE_CTIMING:
				return TYPE_CTIMING_EDEFAULT == null ? typeCTiming != null : !TYPE_CTIMING_EDEFAULT.equals(typeCTiming);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (CSCreationClassName: ");
		result.append(csCreationClassName);
		result.append(", CSName: ");
		result.append(csName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", DMAChannel: ");
		result.append(dmaChannel);
		result.append(", Availability: ");
		result.append(availability);
		result.append(", BurstMode: ");
		result.append(burstMode);
		result.append(", TransferWidths: ");
		result.append(transferWidths);
		result.append(", AddressSize: ");
		result.append(addressSize);
		result.append(", MaxTransferSize: ");
		result.append(maxTransferSize);
		result.append(", ByteMode: ");
		result.append(byteMode);
		result.append(", WordMode: ");
		result.append(wordMode);
		result.append(", ChannelTiming: ");
		result.append(channelTiming);
		result.append(", TypeCTiming: ");
		result.append(typeCTiming);
		result.append(')');
		return result.toString();
	}

} //CIM_DMAImpl
