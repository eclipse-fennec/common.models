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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_LogicalElement;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_StorageElementCompositionService;
import org.dmtf.cim.CIM_StorageExtent;
import org.dmtf.cim.CIM_StoragePool;
import org.dmtf.cim.CIM_StorageSetting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Element Composition Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_StorageElementCompositionServiceImpl extends CIM_ServiceImpl implements CIM_StorageElementCompositionService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageElementCompositionServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageElementCompositionService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateOrModifyCompositeElement(String ElementName, Integer ElementType, CIM_ConcreteJob Job, CIM_ManagedElement Goal, CIM_StorageExtent RepresentativeElement, Long Size, EList<CIM_StorageExtent> InElements, CIM_LogicalElement TheElement, Integer CompositeType, Integer ElementSource) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ReturnElementToElements(CIM_ConcreteJob Job, CIM_LogicalElement TheElement, EList<CIM_StorageExtent> OutElements) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long RemoveElementsFromElement(CIM_ConcreteJob Job, CIM_LogicalElement TheElement, EList<CIM_LogicalElement> InElements) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetAvailableElements(CIM_ConcreteJob Job, EList<CIM_StoragePool> InPools, CIM_StorageSetting Goal, Integer ElementType, CIM_StorageExtent RepresentativeElement, EList<CIM_StorageExtent> Candidates) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetCompositeElements(CIM_ConcreteJob Job, CIM_LogicalElement TheElement, Integer RequestType, EList<CIM_StorageExtent> OutElements, EList<Integer> OutElementTypes) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetSupportedStripeLengths(Integer ElementType, EList<Long> StripeLengths) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetSupportedStripeLengthRange(Integer ElementType, Long MinimumStripeLength, Long MaximumStripeLength, Long StripeLengthDivisor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetSupportedStripeDepths(Integer ElementType, EList<Long> StripeDepths) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetSupportedStripeDepthRange(Integer ElementType, Long MinimumStripeDepth, Long MaximumStripeDepth, Long StripeDepthDivisor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_SERVICE___CREATE_OR_MODIFY_COMPOSITE_ELEMENT__STRING_INTEGER_CIM_CONCRETEJOB_CIM_MANAGEDELEMENT_CIM_STORAGEEXTENT_LONG_ELIST_CIM_LOGICALELEMENT_INTEGER_INTEGER:
				return CreateOrModifyCompositeElement((String)arguments.get(0), (Integer)arguments.get(1), (CIM_ConcreteJob)arguments.get(2), (CIM_ManagedElement)arguments.get(3), (CIM_StorageExtent)arguments.get(4), (Long)arguments.get(5), (EList<CIM_StorageExtent>)arguments.get(6), (CIM_LogicalElement)arguments.get(7), (Integer)arguments.get(8), (Integer)arguments.get(9));
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_SERVICE___RETURN_ELEMENT_TO_ELEMENTS__CIM_CONCRETEJOB_CIM_LOGICALELEMENT_ELIST:
				return ReturnElementToElements((CIM_ConcreteJob)arguments.get(0), (CIM_LogicalElement)arguments.get(1), (EList<CIM_StorageExtent>)arguments.get(2));
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_SERVICE___REMOVE_ELEMENTS_FROM_ELEMENT__CIM_CONCRETEJOB_CIM_LOGICALELEMENT_ELIST:
				return RemoveElementsFromElement((CIM_ConcreteJob)arguments.get(0), (CIM_LogicalElement)arguments.get(1), (EList<CIM_LogicalElement>)arguments.get(2));
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_SERVICE___GET_AVAILABLE_ELEMENTS__CIM_CONCRETEJOB_ELIST_CIM_STORAGESETTING_INTEGER_CIM_STORAGEEXTENT_ELIST:
				return GetAvailableElements((CIM_ConcreteJob)arguments.get(0), (EList<CIM_StoragePool>)arguments.get(1), (CIM_StorageSetting)arguments.get(2), (Integer)arguments.get(3), (CIM_StorageExtent)arguments.get(4), (EList<CIM_StorageExtent>)arguments.get(5));
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_SERVICE___GET_COMPOSITE_ELEMENTS__CIM_CONCRETEJOB_CIM_LOGICALELEMENT_INTEGER_ELIST_ELIST:
				return GetCompositeElements((CIM_ConcreteJob)arguments.get(0), (CIM_LogicalElement)arguments.get(1), (Integer)arguments.get(2), (EList<CIM_StorageExtent>)arguments.get(3), (EList<Integer>)arguments.get(4));
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_SERVICE___GET_SUPPORTED_STRIPE_LENGTHS__INTEGER_ELIST:
				return GetSupportedStripeLengths((Integer)arguments.get(0), (EList<Long>)arguments.get(1));
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_SERVICE___GET_SUPPORTED_STRIPE_LENGTH_RANGE__INTEGER_LONG_LONG_LONG:
				return GetSupportedStripeLengthRange((Integer)arguments.get(0), (Long)arguments.get(1), (Long)arguments.get(2), (Long)arguments.get(3));
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_SERVICE___GET_SUPPORTED_STRIPE_DEPTHS__INTEGER_ELIST:
				return GetSupportedStripeDepths((Integer)arguments.get(0), (EList<Long>)arguments.get(1));
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_SERVICE___GET_SUPPORTED_STRIPE_DEPTH_RANGE__INTEGER_LONG_LONG_LONG:
				return GetSupportedStripeDepthRange((Integer)arguments.get(0), (Long)arguments.get(1), (Long)arguments.get(2), (Long)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_StorageElementCompositionServiceImpl
