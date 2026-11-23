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

import org.dmtf.cim.CIM_BGPAttributes;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BGP Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getLocalPreference <em>Local Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getASPath <em>AS Path</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getAsSet <em>As Set</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getNextHop <em>Next Hop</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getNextHopSelf <em>Next Hop Self</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getMED <em>MED</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getBGPCommunityValue <em>BGP Community Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getAtomicAggregate <em>Atomic Aggregate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getAggregator <em>Aggregator</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesImpl#getOriginatorID <em>Originator ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BGPAttributesImpl extends CIM_LogicalElementImpl implements CIM_BGPAttributes {
	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalPreference() <em>Local Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPreference()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOCAL_PREFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalPreference() <em>Local Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPreference()
	 * @generated
	 * @ordered
	 */
	protected Integer localPreference = LOCAL_PREFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getASPath() <em>AS Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASPath()
	 * @generated
	 * @ordered
	 */
	protected static final String AS_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getASPath() <em>AS Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASPath()
	 * @generated
	 * @ordered
	 */
	protected String asPath = AS_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAsSet() <em>As Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsSet()
	 * @generated
	 * @ordered
	 */
	protected static final String AS_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsSet() <em>As Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsSet()
	 * @generated
	 * @ordered
	 */
	protected String asSet = AS_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextHop() <em>Next Hop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextHop()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_HOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextHop() <em>Next Hop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextHop()
	 * @generated
	 * @ordered
	 */
	protected String nextHop = NEXT_HOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextHopSelf() <em>Next Hop Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextHopSelf()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_HOP_SELF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextHopSelf() <em>Next Hop Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextHopSelf()
	 * @generated
	 * @ordered
	 */
	protected String nextHopSelf = NEXT_HOP_SELF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMED() <em>MED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMED()
	 * @generated
	 * @ordered
	 */
	protected static final Long MED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMED() <em>MED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMED()
	 * @generated
	 * @ordered
	 */
	protected Long med = MED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBGPCommunityValue() <em>BGP Community Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPCommunityValue()
	 * @generated
	 * @ordered
	 */
	protected static final Long BGP_COMMUNITY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBGPCommunityValue() <em>BGP Community Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPCommunityValue()
	 * @generated
	 * @ordered
	 */
	protected Long bgpCommunityValue = BGP_COMMUNITY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAtomicAggregate() <em>Atomic Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomicAggregate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ATOMIC_AGGREGATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtomicAggregate() <em>Atomic Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomicAggregate()
	 * @generated
	 * @ordered
	 */
	protected Boolean atomicAggregate = ATOMIC_AGGREGATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregator() <em>Aggregator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregator()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregator() <em>Aggregator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregator()
	 * @generated
	 * @ordered
	 */
	protected String aggregator = AGGREGATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Integer origin = ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginatorID() <em>Originator ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorID()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINATOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginatorID() <em>Originator ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorID()
	 * @generated
	 * @ordered
	 */
	protected String originatorID = ORIGINATOR_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BGPAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BGPAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocalPreference() {
		return localPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalPreference(Integer newLocalPreference) {
		Integer oldLocalPreference = localPreference;
		localPreference = newLocalPreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__LOCAL_PREFERENCE, oldLocalPreference, localPreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getASPath() {
		return asPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setASPath(String newASPath) {
		String oldASPath = asPath;
		asPath = newASPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__AS_PATH, oldASPath, asPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAsSet() {
		return asSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsSet(String newAsSet) {
		String oldAsSet = asSet;
		asSet = newAsSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__AS_SET, oldAsSet, asSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNextHop() {
		return nextHop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextHop(String newNextHop) {
		String oldNextHop = nextHop;
		nextHop = newNextHop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__NEXT_HOP, oldNextHop, nextHop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNextHopSelf() {
		return nextHopSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextHopSelf(String newNextHopSelf) {
		String oldNextHopSelf = nextHopSelf;
		nextHopSelf = newNextHopSelf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__NEXT_HOP_SELF, oldNextHopSelf, nextHopSelf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMED() {
		return med;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMED(Long newMED) {
		Long oldMED = med;
		med = newMED;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__MED, oldMED, med));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBGPCommunityValue() {
		return bgpCommunityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBGPCommunityValue(Long newBGPCommunityValue) {
		Long oldBGPCommunityValue = bgpCommunityValue;
		bgpCommunityValue = newBGPCommunityValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__BGP_COMMUNITY_VALUE, oldBGPCommunityValue, bgpCommunityValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAtomicAggregate() {
		return atomicAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAtomicAggregate(Boolean newAtomicAggregate) {
		Boolean oldAtomicAggregate = atomicAggregate;
		atomicAggregate = newAtomicAggregate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__ATOMIC_AGGREGATE, oldAtomicAggregate, atomicAggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAggregator() {
		return aggregator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregator(String newAggregator) {
		String oldAggregator = aggregator;
		aggregator = newAggregator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__AGGREGATOR, oldAggregator, aggregator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(Integer newOrigin) {
		Integer oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginatorID() {
		return originatorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatorID(String newOriginatorID) {
		String oldOriginatorID = originatorID;
		originatorID = newOriginatorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES__ORIGINATOR_ID, oldOriginatorID, originatorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BGP_ATTRIBUTES__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_BGP_ATTRIBUTES__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_BGP_ATTRIBUTES__VERSION:
				return getVersion();
			case CimPackage.CIM_BGP_ATTRIBUTES__LOCAL_PREFERENCE:
				return getLocalPreference();
			case CimPackage.CIM_BGP_ATTRIBUTES__AS_PATH:
				return getASPath();
			case CimPackage.CIM_BGP_ATTRIBUTES__AS_SET:
				return getAsSet();
			case CimPackage.CIM_BGP_ATTRIBUTES__NEXT_HOP:
				return getNextHop();
			case CimPackage.CIM_BGP_ATTRIBUTES__NEXT_HOP_SELF:
				return getNextHopSelf();
			case CimPackage.CIM_BGP_ATTRIBUTES__MED:
				return getMED();
			case CimPackage.CIM_BGP_ATTRIBUTES__BGP_COMMUNITY_VALUE:
				return getBGPCommunityValue();
			case CimPackage.CIM_BGP_ATTRIBUTES__ATOMIC_AGGREGATE:
				return getAtomicAggregate();
			case CimPackage.CIM_BGP_ATTRIBUTES__AGGREGATOR:
				return getAggregator();
			case CimPackage.CIM_BGP_ATTRIBUTES__ORIGIN:
				return getOrigin();
			case CimPackage.CIM_BGP_ATTRIBUTES__ORIGINATOR_ID:
				return getOriginatorID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_BGP_ATTRIBUTES__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__VERSION:
				setVersion((String)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__LOCAL_PREFERENCE:
				setLocalPreference((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__AS_PATH:
				setASPath((String)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__AS_SET:
				setAsSet((String)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__NEXT_HOP:
				setNextHop((String)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__NEXT_HOP_SELF:
				setNextHopSelf((String)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__MED:
				setMED((Long)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__BGP_COMMUNITY_VALUE:
				setBGPCommunityValue((Long)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__ATOMIC_AGGREGATE:
				setAtomicAggregate((Boolean)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__AGGREGATOR:
				setAggregator((String)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__ORIGIN:
				setOrigin((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__ORIGINATOR_ID:
				setOriginatorID((String)newValue);
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
			case CimPackage.CIM_BGP_ATTRIBUTES__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__LOCAL_PREFERENCE:
				setLocalPreference(LOCAL_PREFERENCE_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__AS_PATH:
				setASPath(AS_PATH_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__AS_SET:
				setAsSet(AS_SET_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__NEXT_HOP:
				setNextHop(NEXT_HOP_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__NEXT_HOP_SELF:
				setNextHopSelf(NEXT_HOP_SELF_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__MED:
				setMED(MED_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__BGP_COMMUNITY_VALUE:
				setBGPCommunityValue(BGP_COMMUNITY_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__ATOMIC_AGGREGATE:
				setAtomicAggregate(ATOMIC_AGGREGATE_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__AGGREGATOR:
				setAggregator(AGGREGATOR_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES__ORIGINATOR_ID:
				setOriginatorID(ORIGINATOR_ID_EDEFAULT);
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
			case CimPackage.CIM_BGP_ATTRIBUTES__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_BGP_ATTRIBUTES__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_BGP_ATTRIBUTES__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.CIM_BGP_ATTRIBUTES__LOCAL_PREFERENCE:
				return LOCAL_PREFERENCE_EDEFAULT == null ? localPreference != null : !LOCAL_PREFERENCE_EDEFAULT.equals(localPreference);
			case CimPackage.CIM_BGP_ATTRIBUTES__AS_PATH:
				return AS_PATH_EDEFAULT == null ? asPath != null : !AS_PATH_EDEFAULT.equals(asPath);
			case CimPackage.CIM_BGP_ATTRIBUTES__AS_SET:
				return AS_SET_EDEFAULT == null ? asSet != null : !AS_SET_EDEFAULT.equals(asSet);
			case CimPackage.CIM_BGP_ATTRIBUTES__NEXT_HOP:
				return NEXT_HOP_EDEFAULT == null ? nextHop != null : !NEXT_HOP_EDEFAULT.equals(nextHop);
			case CimPackage.CIM_BGP_ATTRIBUTES__NEXT_HOP_SELF:
				return NEXT_HOP_SELF_EDEFAULT == null ? nextHopSelf != null : !NEXT_HOP_SELF_EDEFAULT.equals(nextHopSelf);
			case CimPackage.CIM_BGP_ATTRIBUTES__MED:
				return MED_EDEFAULT == null ? med != null : !MED_EDEFAULT.equals(med);
			case CimPackage.CIM_BGP_ATTRIBUTES__BGP_COMMUNITY_VALUE:
				return BGP_COMMUNITY_VALUE_EDEFAULT == null ? bgpCommunityValue != null : !BGP_COMMUNITY_VALUE_EDEFAULT.equals(bgpCommunityValue);
			case CimPackage.CIM_BGP_ATTRIBUTES__ATOMIC_AGGREGATE:
				return ATOMIC_AGGREGATE_EDEFAULT == null ? atomicAggregate != null : !ATOMIC_AGGREGATE_EDEFAULT.equals(atomicAggregate);
			case CimPackage.CIM_BGP_ATTRIBUTES__AGGREGATOR:
				return AGGREGATOR_EDEFAULT == null ? aggregator != null : !AGGREGATOR_EDEFAULT.equals(aggregator);
			case CimPackage.CIM_BGP_ATTRIBUTES__ORIGIN:
				return ORIGIN_EDEFAULT == null ? origin != null : !ORIGIN_EDEFAULT.equals(origin);
			case CimPackage.CIM_BGP_ATTRIBUTES__ORIGINATOR_ID:
				return ORIGINATOR_ID_EDEFAULT == null ? originatorID != null : !ORIGINATOR_ID_EDEFAULT.equals(originatorID);
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
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", Version: ");
		result.append(version);
		result.append(", LocalPreference: ");
		result.append(localPreference);
		result.append(", ASPath: ");
		result.append(asPath);
		result.append(", AsSet: ");
		result.append(asSet);
		result.append(", NextHop: ");
		result.append(nextHop);
		result.append(", NextHopSelf: ");
		result.append(nextHopSelf);
		result.append(", MED: ");
		result.append(med);
		result.append(", BGPCommunityValue: ");
		result.append(bgpCommunityValue);
		result.append(", AtomicAggregate: ");
		result.append(atomicAggregate);
		result.append(", Aggregator: ");
		result.append(aggregator);
		result.append(", Origin: ");
		result.append(origin);
		result.append(", OriginatorID: ");
		result.append(originatorID);
		result.append(')');
		return result.toString();
	}

} //CIM_BGPAttributesImpl
