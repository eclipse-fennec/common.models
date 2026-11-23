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
package org.dmtf.prs;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Solution Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_SolutionElement is an abstract base class for non-Category objects that are associated with a Solution. This includes: 
 * PRS_Reference 
 * PRS_Problem 
 * PRS_Resolution 
 * 
 * PRS_SolutionElement provides a common reference for these objects to be associated with PRS_Expression objects through the SolutionExpression association. 
 * 
 * In addition, all of the derived objects may be retrieved with a single query for the common super-class.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_SolutionElement()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_SolutionElement extends PRS_ExchangeElement {
} // PRS_SolutionElement
