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

import org.dmtf.cim.CIM_BaseMetricDefinition;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Base Metric Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricDefinitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricDefinitionImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricDefinitionImpl#getCalculable <em>Calculable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricDefinitionImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricDefinitionImpl#getProgrammaticUnits <em>Programmatic Units</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricDefinitionImpl#getBreakdownDimensions <em>Breakdown Dimensions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricDefinitionImpl#getIsContinuous <em>Is Continuous</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricDefinitionImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricDefinitionImpl#getTimeScope <em>Time Scope</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricDefinitionImpl#getGatheringType <em>Gathering Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BaseMetricDefinitionImpl extends CIM_ManagedElementImpl implements CIM_BaseMetricDefinition {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected Integer dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalculable() <em>Calculable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculable()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CALCULABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalculable() <em>Calculable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculable()
	 * @generated
	 * @ordered
	 */
	protected Integer calculable = CALCULABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected String units = UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgrammaticUnits() <em>Programmatic Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammaticUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAMMATIC_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgrammaticUnits() <em>Programmatic Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammaticUnits()
	 * @generated
	 * @ordered
	 */
	protected String programmaticUnits = PROGRAMMATIC_UNITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBreakdownDimensions() <em>Breakdown Dimensions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakdownDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> breakdownDimensions;

	/**
	 * The default value of the '{@link #getIsContinuous() <em>Is Continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsContinuous()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONTINUOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsContinuous() <em>Is Continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsContinuous()
	 * @generated
	 * @ordered
	 */
	protected Boolean isContinuous = IS_CONTINUOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeType() <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHANGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeType() <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeType()
	 * @generated
	 * @ordered
	 */
	protected Integer changeType = CHANGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeScope() <em>Time Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeScope()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TIME_SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeScope() <em>Time Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeScope()
	 * @generated
	 * @ordered
	 */
	protected Integer timeScope = TIME_SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGatheringType() <em>Gathering Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatheringType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer GATHERING_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatheringType() <em>Gathering Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatheringType()
	 * @generated
	 * @ordered
	 */
	protected Integer gatheringType = GATHERING_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BaseMetricDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BaseMetricDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_DEFINITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(Integer newDataType) {
		Integer oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_DEFINITION__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCalculable() {
		return calculable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalculable(Integer newCalculable) {
		Integer oldCalculable = calculable;
		calculable = newCalculable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_DEFINITION__CALCULABLE, oldCalculable, calculable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnits(String newUnits) {
		String oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_DEFINITION__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProgrammaticUnits() {
		return programmaticUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammaticUnits(String newProgrammaticUnits) {
		String oldProgrammaticUnits = programmaticUnits;
		programmaticUnits = newProgrammaticUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_DEFINITION__PROGRAMMATIC_UNITS, oldProgrammaticUnits, programmaticUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getBreakdownDimensions() {
		if (breakdownDimensions == null) {
			breakdownDimensions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_BASE_METRIC_DEFINITION__BREAKDOWN_DIMENSIONS);
		}
		return breakdownDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsContinuous() {
		return isContinuous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsContinuous(Boolean newIsContinuous) {
		Boolean oldIsContinuous = isContinuous;
		isContinuous = newIsContinuous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_DEFINITION__IS_CONTINUOUS, oldIsContinuous, isContinuous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getChangeType() {
		return changeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeType(Integer newChangeType) {
		Integer oldChangeType = changeType;
		changeType = newChangeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_DEFINITION__CHANGE_TYPE, oldChangeType, changeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTimeScope() {
		return timeScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeScope(Integer newTimeScope) {
		Integer oldTimeScope = timeScope;
		timeScope = newTimeScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_DEFINITION__TIME_SCOPE, oldTimeScope, timeScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getGatheringType() {
		return gatheringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatheringType(Integer newGatheringType) {
		Integer oldGatheringType = gatheringType;
		gatheringType = newGatheringType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_DEFINITION__GATHERING_TYPE, oldGatheringType, gatheringType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BASE_METRIC_DEFINITION__ID:
				return getId();
			case CimPackage.CIM_BASE_METRIC_DEFINITION__NAME:
				return getName();
			case CimPackage.CIM_BASE_METRIC_DEFINITION__DATA_TYPE:
				return getDataType();
			case CimPackage.CIM_BASE_METRIC_DEFINITION__CALCULABLE:
				return getCalculable();
			case CimPackage.CIM_BASE_METRIC_DEFINITION__UNITS:
				return getUnits();
			case CimPackage.CIM_BASE_METRIC_DEFINITION__PROGRAMMATIC_UNITS:
				return getProgrammaticUnits();
			case CimPackage.CIM_BASE_METRIC_DEFINITION__BREAKDOWN_DIMENSIONS:
				return getBreakdownDimensions();
			case CimPackage.CIM_BASE_METRIC_DEFINITION__IS_CONTINUOUS:
				return getIsContinuous();
			case CimPackage.CIM_BASE_METRIC_DEFINITION__CHANGE_TYPE:
				return getChangeType();
			case CimPackage.CIM_BASE_METRIC_DEFINITION__TIME_SCOPE:
				return getTimeScope();
			case CimPackage.CIM_BASE_METRIC_DEFINITION__GATHERING_TYPE:
				return getGatheringType();
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
			case CimPackage.CIM_BASE_METRIC_DEFINITION__ID:
				setId((String)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__DATA_TYPE:
				setDataType((Integer)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__CALCULABLE:
				setCalculable((Integer)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__UNITS:
				setUnits((String)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__PROGRAMMATIC_UNITS:
				setProgrammaticUnits((String)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__BREAKDOWN_DIMENSIONS:
				getBreakdownDimensions().clear();
				getBreakdownDimensions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__IS_CONTINUOUS:
				setIsContinuous((Boolean)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__CHANGE_TYPE:
				setChangeType((Integer)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__TIME_SCOPE:
				setTimeScope((Integer)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__GATHERING_TYPE:
				setGatheringType((Integer)newValue);
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
			case CimPackage.CIM_BASE_METRIC_DEFINITION__ID:
				setId(ID_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__CALCULABLE:
				setCalculable(CALCULABLE_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__UNITS:
				setUnits(UNITS_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__PROGRAMMATIC_UNITS:
				setProgrammaticUnits(PROGRAMMATIC_UNITS_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__BREAKDOWN_DIMENSIONS:
				getBreakdownDimensions().clear();
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__IS_CONTINUOUS:
				setIsContinuous(IS_CONTINUOUS_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__CHANGE_TYPE:
				setChangeType(CHANGE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__TIME_SCOPE:
				setTimeScope(TIME_SCOPE_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_DEFINITION__GATHERING_TYPE:
				setGatheringType(GATHERING_TYPE_EDEFAULT);
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
			case CimPackage.CIM_BASE_METRIC_DEFINITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CimPackage.CIM_BASE_METRIC_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_BASE_METRIC_DEFINITION__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
			case CimPackage.CIM_BASE_METRIC_DEFINITION__CALCULABLE:
				return CALCULABLE_EDEFAULT == null ? calculable != null : !CALCULABLE_EDEFAULT.equals(calculable);
			case CimPackage.CIM_BASE_METRIC_DEFINITION__UNITS:
				return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
			case CimPackage.CIM_BASE_METRIC_DEFINITION__PROGRAMMATIC_UNITS:
				return PROGRAMMATIC_UNITS_EDEFAULT == null ? programmaticUnits != null : !PROGRAMMATIC_UNITS_EDEFAULT.equals(programmaticUnits);
			case CimPackage.CIM_BASE_METRIC_DEFINITION__BREAKDOWN_DIMENSIONS:
				return breakdownDimensions != null && !breakdownDimensions.isEmpty();
			case CimPackage.CIM_BASE_METRIC_DEFINITION__IS_CONTINUOUS:
				return IS_CONTINUOUS_EDEFAULT == null ? isContinuous != null : !IS_CONTINUOUS_EDEFAULT.equals(isContinuous);
			case CimPackage.CIM_BASE_METRIC_DEFINITION__CHANGE_TYPE:
				return CHANGE_TYPE_EDEFAULT == null ? changeType != null : !CHANGE_TYPE_EDEFAULT.equals(changeType);
			case CimPackage.CIM_BASE_METRIC_DEFINITION__TIME_SCOPE:
				return TIME_SCOPE_EDEFAULT == null ? timeScope != null : !TIME_SCOPE_EDEFAULT.equals(timeScope);
			case CimPackage.CIM_BASE_METRIC_DEFINITION__GATHERING_TYPE:
				return GATHERING_TYPE_EDEFAULT == null ? gatheringType != null : !GATHERING_TYPE_EDEFAULT.equals(gatheringType);
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
		result.append(" (Id: ");
		result.append(id);
		result.append(", Name: ");
		result.append(name);
		result.append(", DataType: ");
		result.append(dataType);
		result.append(", Calculable: ");
		result.append(calculable);
		result.append(", Units: ");
		result.append(units);
		result.append(", ProgrammaticUnits: ");
		result.append(programmaticUnits);
		result.append(", BreakdownDimensions: ");
		result.append(breakdownDimensions);
		result.append(", IsContinuous: ");
		result.append(isContinuous);
		result.append(", ChangeType: ");
		result.append(changeType);
		result.append(", TimeScope: ");
		result.append(timeScope);
		result.append(", GatheringType: ");
		result.append(gatheringType);
		result.append(')');
		return result.toString();
	}

} //CIM_BaseMetricDefinitionImpl
