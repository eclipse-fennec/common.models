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

import org.dmtf.cim.CIM_BGPPathAttributes;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BGP Path Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPathAttributesImpl#getASNumbers <em>AS Numbers</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPathAttributesImpl#getPathAttrNextHop <em>Path Attr Next Hop</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPathAttributesImpl#getPathAttrASPathSegment <em>Path Attr AS Path Segment</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPathAttributesImpl#getPathAttrOrigin <em>Path Attr Origin</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPathAttributesImpl#getPathAttrMultiExitDisc <em>Path Attr Multi Exit Disc</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPathAttributesImpl#getPathAttrLocalPref <em>Path Attr Local Pref</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPathAttributesImpl#getPathAttrAtomicAggregate <em>Path Attr Atomic Aggregate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPathAttributesImpl#getPathAttrAggregatorAS <em>Path Attr Aggregator AS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPathAttributesImpl#getPathAttrAggregatorAddr <em>Path Attr Aggregator Addr</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPathAttributesImpl#getPathAttrCalcLocalPref <em>Path Attr Calc Local Pref</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPathAttributesImpl#getPathAttrBest <em>Path Attr Best</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPathAttributesImpl#getPathAttrUnknown <em>Path Attr Unknown</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPathAttributesImpl#getPathAttrUnknownNumber <em>Path Attr Unknown Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BGPPathAttributesImpl extends CIM_LogicalElementImpl implements CIM_BGPPathAttributes {
	/**
	 * The default value of the '{@link #getASNumbers() <em>AS Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASNumbers()
	 * @generated
	 * @ordered
	 */
	protected static final String AS_NUMBERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getASNumbers() <em>AS Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASNumbers()
	 * @generated
	 * @ordered
	 */
	protected String asNumbers = AS_NUMBERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathAttrNextHop() <em>Path Attr Next Hop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrNextHop()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_ATTR_NEXT_HOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAttrNextHop() <em>Path Attr Next Hop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrNextHop()
	 * @generated
	 * @ordered
	 */
	protected String pathAttrNextHop = PATH_ATTR_NEXT_HOP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPathAttrASPathSegment() <em>Path Attr AS Path Segment</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrASPathSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> pathAttrASPathSegment;

	/**
	 * The default value of the '{@link #getPathAttrOrigin() <em>Path Attr Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PATH_ATTR_ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAttrOrigin() <em>Path Attr Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrOrigin()
	 * @generated
	 * @ordered
	 */
	protected Integer pathAttrOrigin = PATH_ATTR_ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathAttrMultiExitDisc() <em>Path Attr Multi Exit Disc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrMultiExitDisc()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PATH_ATTR_MULTI_EXIT_DISC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAttrMultiExitDisc() <em>Path Attr Multi Exit Disc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrMultiExitDisc()
	 * @generated
	 * @ordered
	 */
	protected Integer pathAttrMultiExitDisc = PATH_ATTR_MULTI_EXIT_DISC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathAttrLocalPref() <em>Path Attr Local Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrLocalPref()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PATH_ATTR_LOCAL_PREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAttrLocalPref() <em>Path Attr Local Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrLocalPref()
	 * @generated
	 * @ordered
	 */
	protected Integer pathAttrLocalPref = PATH_ATTR_LOCAL_PREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathAttrAtomicAggregate() <em>Path Attr Atomic Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrAtomicAggregate()
	 * @generated
	 * @ordered
	 */
	protected static final Long PATH_ATTR_ATOMIC_AGGREGATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAttrAtomicAggregate() <em>Path Attr Atomic Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrAtomicAggregate()
	 * @generated
	 * @ordered
	 */
	protected Long pathAttrAtomicAggregate = PATH_ATTR_ATOMIC_AGGREGATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathAttrAggregatorAS() <em>Path Attr Aggregator AS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrAggregatorAS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PATH_ATTR_AGGREGATOR_AS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAttrAggregatorAS() <em>Path Attr Aggregator AS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrAggregatorAS()
	 * @generated
	 * @ordered
	 */
	protected Integer pathAttrAggregatorAS = PATH_ATTR_AGGREGATOR_AS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathAttrAggregatorAddr() <em>Path Attr Aggregator Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrAggregatorAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_ATTR_AGGREGATOR_ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAttrAggregatorAddr() <em>Path Attr Aggregator Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrAggregatorAddr()
	 * @generated
	 * @ordered
	 */
	protected String pathAttrAggregatorAddr = PATH_ATTR_AGGREGATOR_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathAttrCalcLocalPref() <em>Path Attr Calc Local Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrCalcLocalPref()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PATH_ATTR_CALC_LOCAL_PREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAttrCalcLocalPref() <em>Path Attr Calc Local Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrCalcLocalPref()
	 * @generated
	 * @ordered
	 */
	protected Integer pathAttrCalcLocalPref = PATH_ATTR_CALC_LOCAL_PREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathAttrBest() <em>Path Attr Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrBest()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PATH_ATTR_BEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAttrBest() <em>Path Attr Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrBest()
	 * @generated
	 * @ordered
	 */
	protected Integer pathAttrBest = PATH_ATTR_BEST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPathAttrUnknown() <em>Path Attr Unknown</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrUnknown()
	 * @generated
	 * @ordered
	 */
	protected EList<String> pathAttrUnknown;

	/**
	 * The default value of the '{@link #getPathAttrUnknownNumber() <em>Path Attr Unknown Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrUnknownNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PATH_ATTR_UNKNOWN_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAttrUnknownNumber() <em>Path Attr Unknown Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrUnknownNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer pathAttrUnknownNumber = PATH_ATTR_UNKNOWN_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BGPPathAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BGPPathAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getASNumbers() {
		return asNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setASNumbers(String newASNumbers) {
		String oldASNumbers = asNumbers;
		asNumbers = newASNumbers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PATH_ATTRIBUTES__AS_NUMBERS, oldASNumbers, asNumbers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathAttrNextHop() {
		return pathAttrNextHop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAttrNextHop(String newPathAttrNextHop) {
		String oldPathAttrNextHop = pathAttrNextHop;
		pathAttrNextHop = newPathAttrNextHop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_NEXT_HOP, oldPathAttrNextHop, pathAttrNextHop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPathAttrASPathSegment() {
		if (pathAttrASPathSegment == null) {
			pathAttrASPathSegment = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AS_PATH_SEGMENT);
		}
		return pathAttrASPathSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPathAttrOrigin() {
		return pathAttrOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAttrOrigin(Integer newPathAttrOrigin) {
		Integer oldPathAttrOrigin = pathAttrOrigin;
		pathAttrOrigin = newPathAttrOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_ORIGIN, oldPathAttrOrigin, pathAttrOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPathAttrMultiExitDisc() {
		return pathAttrMultiExitDisc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAttrMultiExitDisc(Integer newPathAttrMultiExitDisc) {
		Integer oldPathAttrMultiExitDisc = pathAttrMultiExitDisc;
		pathAttrMultiExitDisc = newPathAttrMultiExitDisc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_MULTI_EXIT_DISC, oldPathAttrMultiExitDisc, pathAttrMultiExitDisc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPathAttrLocalPref() {
		return pathAttrLocalPref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAttrLocalPref(Integer newPathAttrLocalPref) {
		Integer oldPathAttrLocalPref = pathAttrLocalPref;
		pathAttrLocalPref = newPathAttrLocalPref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_LOCAL_PREF, oldPathAttrLocalPref, pathAttrLocalPref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPathAttrAtomicAggregate() {
		return pathAttrAtomicAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAttrAtomicAggregate(Long newPathAttrAtomicAggregate) {
		Long oldPathAttrAtomicAggregate = pathAttrAtomicAggregate;
		pathAttrAtomicAggregate = newPathAttrAtomicAggregate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_ATOMIC_AGGREGATE, oldPathAttrAtomicAggregate, pathAttrAtomicAggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPathAttrAggregatorAS() {
		return pathAttrAggregatorAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAttrAggregatorAS(Integer newPathAttrAggregatorAS) {
		Integer oldPathAttrAggregatorAS = pathAttrAggregatorAS;
		pathAttrAggregatorAS = newPathAttrAggregatorAS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AGGREGATOR_AS, oldPathAttrAggregatorAS, pathAttrAggregatorAS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathAttrAggregatorAddr() {
		return pathAttrAggregatorAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAttrAggregatorAddr(String newPathAttrAggregatorAddr) {
		String oldPathAttrAggregatorAddr = pathAttrAggregatorAddr;
		pathAttrAggregatorAddr = newPathAttrAggregatorAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AGGREGATOR_ADDR, oldPathAttrAggregatorAddr, pathAttrAggregatorAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPathAttrCalcLocalPref() {
		return pathAttrCalcLocalPref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAttrCalcLocalPref(Integer newPathAttrCalcLocalPref) {
		Integer oldPathAttrCalcLocalPref = pathAttrCalcLocalPref;
		pathAttrCalcLocalPref = newPathAttrCalcLocalPref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_CALC_LOCAL_PREF, oldPathAttrCalcLocalPref, pathAttrCalcLocalPref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPathAttrBest() {
		return pathAttrBest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAttrBest(Integer newPathAttrBest) {
		Integer oldPathAttrBest = pathAttrBest;
		pathAttrBest = newPathAttrBest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_BEST, oldPathAttrBest, pathAttrBest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPathAttrUnknown() {
		if (pathAttrUnknown == null) {
			pathAttrUnknown = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_UNKNOWN);
		}
		return pathAttrUnknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPathAttrUnknownNumber() {
		return pathAttrUnknownNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAttrUnknownNumber(Integer newPathAttrUnknownNumber) {
		Integer oldPathAttrUnknownNumber = pathAttrUnknownNumber;
		pathAttrUnknownNumber = newPathAttrUnknownNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_UNKNOWN_NUMBER, oldPathAttrUnknownNumber, pathAttrUnknownNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__AS_NUMBERS:
				return getASNumbers();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_NEXT_HOP:
				return getPathAttrNextHop();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AS_PATH_SEGMENT:
				return getPathAttrASPathSegment();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_ORIGIN:
				return getPathAttrOrigin();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_MULTI_EXIT_DISC:
				return getPathAttrMultiExitDisc();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_LOCAL_PREF:
				return getPathAttrLocalPref();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_ATOMIC_AGGREGATE:
				return getPathAttrAtomicAggregate();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AGGREGATOR_AS:
				return getPathAttrAggregatorAS();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AGGREGATOR_ADDR:
				return getPathAttrAggregatorAddr();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_CALC_LOCAL_PREF:
				return getPathAttrCalcLocalPref();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_BEST:
				return getPathAttrBest();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_UNKNOWN:
				return getPathAttrUnknown();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_UNKNOWN_NUMBER:
				return getPathAttrUnknownNumber();
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
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__AS_NUMBERS:
				setASNumbers((String)newValue);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_NEXT_HOP:
				setPathAttrNextHop((String)newValue);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AS_PATH_SEGMENT:
				getPathAttrASPathSegment().clear();
				getPathAttrASPathSegment().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_ORIGIN:
				setPathAttrOrigin((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_MULTI_EXIT_DISC:
				setPathAttrMultiExitDisc((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_LOCAL_PREF:
				setPathAttrLocalPref((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_ATOMIC_AGGREGATE:
				setPathAttrAtomicAggregate((Long)newValue);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AGGREGATOR_AS:
				setPathAttrAggregatorAS((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AGGREGATOR_ADDR:
				setPathAttrAggregatorAddr((String)newValue);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_CALC_LOCAL_PREF:
				setPathAttrCalcLocalPref((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_BEST:
				setPathAttrBest((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_UNKNOWN:
				getPathAttrUnknown().clear();
				getPathAttrUnknown().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_UNKNOWN_NUMBER:
				setPathAttrUnknownNumber((Integer)newValue);
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
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__AS_NUMBERS:
				setASNumbers(AS_NUMBERS_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_NEXT_HOP:
				setPathAttrNextHop(PATH_ATTR_NEXT_HOP_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AS_PATH_SEGMENT:
				getPathAttrASPathSegment().clear();
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_ORIGIN:
				setPathAttrOrigin(PATH_ATTR_ORIGIN_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_MULTI_EXIT_DISC:
				setPathAttrMultiExitDisc(PATH_ATTR_MULTI_EXIT_DISC_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_LOCAL_PREF:
				setPathAttrLocalPref(PATH_ATTR_LOCAL_PREF_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_ATOMIC_AGGREGATE:
				setPathAttrAtomicAggregate(PATH_ATTR_ATOMIC_AGGREGATE_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AGGREGATOR_AS:
				setPathAttrAggregatorAS(PATH_ATTR_AGGREGATOR_AS_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AGGREGATOR_ADDR:
				setPathAttrAggregatorAddr(PATH_ATTR_AGGREGATOR_ADDR_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_CALC_LOCAL_PREF:
				setPathAttrCalcLocalPref(PATH_ATTR_CALC_LOCAL_PREF_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_BEST:
				setPathAttrBest(PATH_ATTR_BEST_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_UNKNOWN:
				getPathAttrUnknown().clear();
				return;
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_UNKNOWN_NUMBER:
				setPathAttrUnknownNumber(PATH_ATTR_UNKNOWN_NUMBER_EDEFAULT);
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
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__AS_NUMBERS:
				return AS_NUMBERS_EDEFAULT == null ? asNumbers != null : !AS_NUMBERS_EDEFAULT.equals(asNumbers);
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_NEXT_HOP:
				return PATH_ATTR_NEXT_HOP_EDEFAULT == null ? pathAttrNextHop != null : !PATH_ATTR_NEXT_HOP_EDEFAULT.equals(pathAttrNextHop);
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AS_PATH_SEGMENT:
				return pathAttrASPathSegment != null && !pathAttrASPathSegment.isEmpty();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_ORIGIN:
				return PATH_ATTR_ORIGIN_EDEFAULT == null ? pathAttrOrigin != null : !PATH_ATTR_ORIGIN_EDEFAULT.equals(pathAttrOrigin);
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_MULTI_EXIT_DISC:
				return PATH_ATTR_MULTI_EXIT_DISC_EDEFAULT == null ? pathAttrMultiExitDisc != null : !PATH_ATTR_MULTI_EXIT_DISC_EDEFAULT.equals(pathAttrMultiExitDisc);
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_LOCAL_PREF:
				return PATH_ATTR_LOCAL_PREF_EDEFAULT == null ? pathAttrLocalPref != null : !PATH_ATTR_LOCAL_PREF_EDEFAULT.equals(pathAttrLocalPref);
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_ATOMIC_AGGREGATE:
				return PATH_ATTR_ATOMIC_AGGREGATE_EDEFAULT == null ? pathAttrAtomicAggregate != null : !PATH_ATTR_ATOMIC_AGGREGATE_EDEFAULT.equals(pathAttrAtomicAggregate);
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AGGREGATOR_AS:
				return PATH_ATTR_AGGREGATOR_AS_EDEFAULT == null ? pathAttrAggregatorAS != null : !PATH_ATTR_AGGREGATOR_AS_EDEFAULT.equals(pathAttrAggregatorAS);
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_AGGREGATOR_ADDR:
				return PATH_ATTR_AGGREGATOR_ADDR_EDEFAULT == null ? pathAttrAggregatorAddr != null : !PATH_ATTR_AGGREGATOR_ADDR_EDEFAULT.equals(pathAttrAggregatorAddr);
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_CALC_LOCAL_PREF:
				return PATH_ATTR_CALC_LOCAL_PREF_EDEFAULT == null ? pathAttrCalcLocalPref != null : !PATH_ATTR_CALC_LOCAL_PREF_EDEFAULT.equals(pathAttrCalcLocalPref);
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_BEST:
				return PATH_ATTR_BEST_EDEFAULT == null ? pathAttrBest != null : !PATH_ATTR_BEST_EDEFAULT.equals(pathAttrBest);
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_UNKNOWN:
				return pathAttrUnknown != null && !pathAttrUnknown.isEmpty();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES__PATH_ATTR_UNKNOWN_NUMBER:
				return PATH_ATTR_UNKNOWN_NUMBER_EDEFAULT == null ? pathAttrUnknownNumber != null : !PATH_ATTR_UNKNOWN_NUMBER_EDEFAULT.equals(pathAttrUnknownNumber);
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
		result.append(" (ASNumbers: ");
		result.append(asNumbers);
		result.append(", PathAttrNextHop: ");
		result.append(pathAttrNextHop);
		result.append(", PathAttrASPathSegment: ");
		result.append(pathAttrASPathSegment);
		result.append(", PathAttrOrigin: ");
		result.append(pathAttrOrigin);
		result.append(", PathAttrMultiExitDisc: ");
		result.append(pathAttrMultiExitDisc);
		result.append(", PathAttrLocalPref: ");
		result.append(pathAttrLocalPref);
		result.append(", PathAttrAtomicAggregate: ");
		result.append(pathAttrAtomicAggregate);
		result.append(", PathAttrAggregatorAS: ");
		result.append(pathAttrAggregatorAS);
		result.append(", PathAttrAggregatorAddr: ");
		result.append(pathAttrAggregatorAddr);
		result.append(", PathAttrCalcLocalPref: ");
		result.append(pathAttrCalcLocalPref);
		result.append(", PathAttrBest: ");
		result.append(pathAttrBest);
		result.append(", PathAttrUnknown: ");
		result.append(pathAttrUnknown);
		result.append(", PathAttrUnknownNumber: ");
		result.append(pathAttrUnknownNumber);
		result.append(')');
		return result.toString();
	}

} //CIM_BGPPathAttributesImpl
